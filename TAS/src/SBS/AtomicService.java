package SBS;

public class AtomicService extends AbstractService  {

    public double failureRate;
    public CostQoS co = new CostQoS();
    public ReliabilityQoS ro = new ReliabilityQoS();
    public double getTimeCost() {
        return co.timeCost;
    }
    public double getReliabilityRate() {
        return ro.reliabilityRate;
    }
    public double getFailureRate() {
        return failureRate;
    }

    public void setFailureRate(double failureRate) {
        this.failureRate = failureRate;
    }


    @Override
    public void startService() throws InterruptedException {
        // 启动服务
        System.out.println("执行服务：");
    }

    @Override
    public void stopService() {
        // 停止服务
        System.out.println("停止服务");
    }

    @Override
    public void invokeOperation() {
        // 调用操作
    }

    @Override
    public void failService() {
        //服务失败
        System.out.println("服务失败");
    }
}
