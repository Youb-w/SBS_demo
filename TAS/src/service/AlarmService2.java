package service;

import SBS.AtomicService;
import SBS.CostQoS;
import SBS.ReliabilityQoS;
import SBS.ServiceStatus;

public class AlarmService2 extends AtomicService {

    public double failureRate = Math.random();
    public CostQoS co = new CostQoS();
    public ReliabilityQoS ro = new ReliabilityQoS();

    {
        co.setTimeCost(5);
        ro.setReliabilityRate(0.3);
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
        ServiceStatus.setStatus("启用服务AlarmService2准备中");
        System.out.println("启用服务AlarmService2准备中");
        Thread.sleep(4);//启用服务系统准备时间

        ServiceStatus.setStatus("执行AlarmService2！");
        System.out.println("执行AlarmService2！");
        Thread.sleep(11);

        ServiceStatus.setStatus("结束服务AlarmService2中");
        System.out.println("结束服务AlarmService2中");
        Thread.sleep(3);//启用服务系统准备时间
    }
}
