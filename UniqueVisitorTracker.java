import java.util.*;

class VisitorTracker {

    private HashSet<String> visitors = new HashSet<>();

    public void addVisitor(String visitorId) {
        visitors.add(visitorId);
    }
    public void displayVisitors() {
        Iterator<String> itr = visitors.iterator();

        System.out.println("Unique Visitors:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
    public int getVisitorCount() {
        return visitors.size();
    }
    public boolean containsVisitor(String visitorId) {
        return visitors.contains(visitorId);
    }
}

public class UniqueVisitorTracker {
    public static void main(String[] args) {
        VisitorTracker tracker = new VisitorTracker();
        tracker.addVisitor("User101");
        tracker.addVisitor("User102");
        tracker.addVisitor("User103");
        tracker.addVisitor("User101"); 
        tracker.addVisitor("User102"); 
        tracker.displayVisitors();
        System.out.println("\nTotal Unique Visitors: "
                + tracker.getVisitorCount());
        System.out.println("User103 Exists: "
                + tracker.containsVisitor("User103"));
    }
}