package SBS;

import java.util.HashMap;
import java.util.Map;

public class ServiceDescription {
    private String ID;
    private String serviceName;
    private String serviceEndPoint;
    private Map<String, Object> operationList = new HashMap<>();
    private Map<String, Object> customProperties = new HashMap<>();

    // 省略了getter和setter方法以及其他可能的方法
}
