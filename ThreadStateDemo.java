class LifeCycleThread extends Thread {

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadStateDemo {

    public static void main(String[] args) {

        LifeCycleThread t = new LifeCycleThread();

        System.out.println("State after creation: " + t.getState()); 

        t.start();
        System.out.println("State after start(): " + t.getState()); 

        try {
            Thread.sleep(100);
            System.out.println("State during sleep: " + t.getState()); 

            t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("State after completion: " + t.getState()); 
    }
}