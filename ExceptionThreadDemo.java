class Task extends Thread {

    public void run() {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled: " + e);
        }

        System.out.println("Thread continues execution");
    }
}

public class ExceptionThreadDemo {
    public static void main(String[] args) {
        Task t = new Task();
        t.start();
    }
}