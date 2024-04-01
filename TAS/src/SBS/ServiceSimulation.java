package SBS;

import service.*;

import java.util.Random;

public class ServiceSimulation {

    private static final Random random = new Random();
    private static final QoSRequirement qosRequirement = new QoSRequirement();
    private static volatile boolean serviceThreadFinished = false;

    public static void main(String[] args) {

        Thread serviceThread = new Thread(() -> {
            int totalCalls = 30;
            for (int i = 0; i < totalCalls; i++) {
                if (random.nextDouble() < 0.7) {
                    // 70%概率调用警报服务
                    try {
                        callAlarmService();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    // 30%概率调用医疗服务
                    try {
                        callMedicalService();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            serviceThreadFinished = true; // 标记服务调用线程结束
        });
        serviceThread.start(); // 启动服务调用线程



        Thread loggerThread = new Thread(() -> {
            AdaptiveSystemLogger logger = new AdaptiveSystemLogger();
            while (!serviceThreadFinished) {
                //每2毫秒记录服务状态
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                logger.log();
            }
        });
        loggerThread.start(); // 启动服务日志记录线程


    }

    private static void callAlarmService() throws InterruptedException {
        AtomicService service = null;
        switch (random.nextInt(3)) {
            case 0:
                service = new AlarmService1();
                break;
            case 1:
                service = new AlarmService2();
                break;
            case 2:
                service = new AlarmService3();
                break;
        }

        executeService(service);
    }

    private static void callMedicalService() throws InterruptedException {
        AtomicService service = random.nextBoolean() ? new MedicalAnalysisService1() : new MedicalAnalysisService2();
        executeService(service);
    }

    private static void executeService(AtomicService service) throws InterruptedException {

//        CostQoS co = (CostQoS) service;
//        ReliabilityQoS ro = (ReliabilityQoS) service;
        if (service.getTimeCost() <= qosRequirement.getTimeRE() && service.getReliabilityRate() >= qosRequirement.getReliabilityRE()) {
            // 检查服务是否执行成功
            while (service.getFailureRate() <= 0.5) {
                System.out.println("服务执行失败，启用自适应解决方案重新调用...");
                service.setFailureRate(Math.random()); // 假设重新调用可能改变失败率

            }
            service.startService(); // 实际执行服务
        }
        else {
            System.out.println("不满足QoS");
        }

    }
}
