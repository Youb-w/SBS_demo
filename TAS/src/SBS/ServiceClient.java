package SBS;

public class ServiceClient {
    private String clientID;

    public void invokeCompositeService(CompositeService service) {
        service.invokeOperation();
    }

    public static void main(String[] args) {

    }

}
