package SBS;

import java.util.HashMap;
import java.util.Map;

public class ServiceRegistry {
    private Map<String, ServiceDescription> serviceList = new HashMap<>();

    public void registerService(String id, ServiceDescription service) {
        serviceList.put(id, service);
    }

    public void unregisterService(String id) {
        serviceList.remove(id);
    }

    public ServiceDescription lookupService(String id) {
        return serviceList.get(id);
    }
}
