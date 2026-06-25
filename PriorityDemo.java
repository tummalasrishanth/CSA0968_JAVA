class MyTask implements Runnable {
    private String name;

    MyTask(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " : " + i);
        }
    }
}

public class PriorityDemo {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyTask("Thread-1"));
        Thread t2 = new Thread(new MyTask("Thread-2"));

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}