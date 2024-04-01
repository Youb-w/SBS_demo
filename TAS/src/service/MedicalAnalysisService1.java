package service;

import SBS.AtomicService;
import SBS.CostQoS;
import SBS.ReliabilityQoS;
import SBS.ServiceStatus;

public class MedicalAnalysisService1 extends AtomicService {

    public double failureRate = Math.random();
    public CostQoS co = new CostQoS();
    public ReliabilityQoS ro = new ReliabilityQoS();

    {
        co.setTimeCost(12);
        ro.setReliabilityRate(0.8);
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
        ServiceStatus.setStatus("启用服务MedicalAnalysisService1准备中");
        System.out.println("启用服务MedicalAnalysisService1准备中");
        Thread.sleep(3);//启用服务系统准备时间

        ServiceStatus.setStatus("MedicalAnalysisService1！");
        System.out.println("MedicalAnalysisService1！");
        Thread.sleep(13);

        ServiceStatus.setStatus("结束服务MedicalAnalysisService1中");
        System.out.println("结束服务MedicalAnalysisService1中");
        Thread.sleep(2);//启用服务系统准备时间
    }
}
