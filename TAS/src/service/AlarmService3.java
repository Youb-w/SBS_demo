package service;

import SBS.AtomicService;
import SBS.CostQoS;
import SBS.ReliabilityQoS;
import SBS.ServiceStatus;

public class AlarmService3 extends AtomicService {

    public double failureRate = Math.random();
    public CostQoS co = new CostQoS();
    public ReliabilityQoS ro = new ReliabilityQoS();

    {
        co.setTimeCost(4);
        ro.setReliabilityRate(1);
    }
    public double getTimeCost() {
        return co.timeCost;
    }
    public double getReliabilityRate() {
        return ro.reliabilityRate;
    }
    public void setFailureRate(double failureRate){
        this.failureRate = failureRate;
    }
    public double getFailureRate() {
        return failureRate;
    }

    @Override
    public void startService() throws InterruptedException {
        ServiceStatus.setStatus("启用服务AlarmService3准备中");
        System.out.println("启用服务AlarmService3准备中");
        Thread.sleep(2);//启用服务系统准备时间

        ServiceStatus.setStatus("执行AlarmService3！");
        System.out.println("执行AlarmService3！");
        Thread.sleep(9);

        ServiceStatus.setStatus("结束服务AlarmService3中");
        System.out.println("结束服务AlarmService3中");
        Thread.sleep(3);//启用服务系统准备时间
    }

}
