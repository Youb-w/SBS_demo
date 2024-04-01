package SBS;

public class CompositeService extends AbstractService {
    private WorkflowEngine workflow;

    public CompositeService(WorkflowEngine workflow) {
        this.workflow = workflow;
    }

    @Override
    public void startService() {
        // 启动服务
    }

    @Override
    public void stopService() {
        // 停止服务
    }

    @Override
    public void invokeOperation() {
        // 实现复合服务的操作调用
        workflow.executeWorkflow();
    }

    @Override
    public void failService() {

    }
}
