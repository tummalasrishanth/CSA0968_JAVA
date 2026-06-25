class HeavyTask extends Thread {

    public HeavyTask(String name) {
        super(name);
    }

    public void run() {
        long sum = 0;

        for (long i = 1; i <= 100000000; i++) {
            sum += i;
        }

        System.out.println(getName() + " completed.");
    }
}

public class PriorityTest {
    public static void main(String[] args) {

        HeavyTask t1 = new HeavyTask("Low Priority");
        HeavyTask t2 = new HeavyTask("Medium Priority");
        HeavyTask t3 = new HeavyTask("High Priority");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}