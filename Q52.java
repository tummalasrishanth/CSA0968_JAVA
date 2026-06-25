class MyThread extends Thread {

    public void run() {

        for(int i=1;i<=5;i++) {
            System.out.println("Thread : " + i);
        }
    }
}

public class Q52 {
    public static void main(String[] args)
            throws Exception {

        Thread.sleep(500);

        MyThread t1 = new MyThread();

        t1.start();

        t1.join();

        System.out.println("Main Thread Ends");
    }
}