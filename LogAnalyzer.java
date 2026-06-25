import java.util.*;

public class LogAnalyzer {
    public static void main(String[] args) {
        Hashtable<String, List<String>> logs = new Hashtable<>();
        String[] data = {
                "ERROR:File Not Found",
                "INFO:Login Successful",
                "ERROR:Database Failure",
                "WARNING:Low Memory",
                "INFO:Logout Successful"
        };
        for (String log : data) {
            String[] parts = log.split(":");
            String type = parts[0];
            String msg = parts[1];
            logs.putIfAbsent(type, new ArrayList<>());
            logs.get(type).add(msg);
        }
        Iterator<String> itr = logs.keySet().iterator();
        while (itr.hasNext()) {
            String type = itr.next();
            System.out.println(type + " Logs:");
            for (String msg : logs.get(type)) {
                System.out.println(" - " + msg);
            }
        }
    }
}