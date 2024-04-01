package SBS;

import javax.xml.ws.Service;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AdaptiveSystemLogger {

    public void log() {
        // 获取当前时间
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

        // 将时间和状态写入到文件中
        try (PrintWriter writer = new PrintWriter(new FileWriter("status_log.txt", true))) {
            writer.println("[" + timestamp + "] " + ServiceStatus.status);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
