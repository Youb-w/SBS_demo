package SBS;

public class ServiceStatus {
//记录当前服务状态
    public static String status;

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        ServiceStatus.status = status;
    }
}
