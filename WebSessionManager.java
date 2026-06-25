import java.util.*;

class Session<T> {
    T data;
    long expiryTime;
    Session(T data, long durationMillis) {
        this.data = data;
        this.expiryTime = System.currentTimeMillis() + durationMillis;
    }
    boolean isExpired() {
        return System.currentTimeMillis() > expiryTime;
    }
}
class SessionManager<T> {
    private HashMap<String, Session<T>> sessions = new HashMap<>();

    public void addSession(String sessionId, T data, long durationMillis) {
        sessions.put(sessionId, new Session<>(data, durationMillis));
    }
    public T getSession(String sessionId) {
        Session<T> session = sessions.get(sessionId);

        if (session == null || session.isExpired()) {
            sessions.remove(sessionId);
            return null;
        }
        return session.data;
    }
    public void removeSession(String sessionId) {
        sessions.remove(sessionId);
    }
    public void removeExpiredSessions() {
        Iterator<Map.Entry<String, Session<T>>> itr =
                sessions.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Session<T>> entry = itr.next();

            if (entry.getValue().isExpired()) {
                itr.remove();
            }
        }
    }
    public void displaySessions() {
        for (Map.Entry<String, Session<T>> entry : sessions.entrySet()) {
            if (!entry.getValue().isExpired()) {
                System.out.println(entry.getKey() +
                        " -> " + entry.getValue().data);
            }
        }
    }
}
public class WebSessionManager {
    public static void main(String[] args) throws Exception {
        SessionManager<String> manager = new SessionManager<>();
        manager.addSession("S101", "Alice", 5000);
        manager.addSession("S102", "Bob", 3000);
        System.out.println("Session S101: "
                + manager.getSession("S101"));
        manager.removeSession("S102");
        System.out.println("After removing S102:");
        manager.displaySessions();
        Thread.sleep(6000);
        manager.removeExpiredSessions();
        System.out.println("\nAfter Expiry:");
        manager.displaySessions();
    }
}