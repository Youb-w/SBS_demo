package service;

import SBS.AtomicService;
import SBS.CostQoS;
import SBS.ReliabilityQoS;
import SBS.ServiceStatus;

public class MedicalAnalysisService2 extends AtomicService {

    public double failureRate = Math.random();
    public CostQoS co = new CostQoS();
    public ReliabilityQoS ro = new ReliabilityQoS();

    {
        co.setTimeCost(20);
        ro.setReliabilityRate(0.9);
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
        ServiceStatus.setStatus("启用服务MedicalAnalysisService2准备中");
        System.out.println("启用服务MedicalAnalysisService2准备中");
        Thread.sleep(2);//启用服务系统准备时间

        ServiceStatus.setStatus("执行MedicalAnalysisService2！");
        System.out.println("执行MedicalAnalysisService2");
        Thread.sleep(12);

        ServiceStatus.setStatus("结束服务MedicalAnalysisService2中");
        System.out.println("结束服务MedicalAnalysisService2中");
        Thread.sleep(2);//启用服务系统准备时间
    }
}
