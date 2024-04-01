package SBS;

public abstract class AbstractService {
    protected String serviceName;
    protected ServiceDescription serviceDescription;

    public abstract void startService() throws InterruptedException;
    public abstract void stopService();
    public abstract void invokeOperation();
    public abstract void failService();
}
