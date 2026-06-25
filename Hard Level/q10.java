class Customer {
    double balance = 10000;

    synchronized void withdraw(double amount) {
        try {
            if (amount > balance) {
                System.out.println("Insufficient Balance. Waiting for deposit...");
                wait();
            }

            balance -= amount;
            System.out.println("Withdraw operation success, balance amount " + (int) balance);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void deposit(double amount) {
        balance += amount;
        notify();
    }
}

public class q10 {

    public static void main(String[] args) {

        Customer c = new Customer();

        Thread t1 = new Thread(() -> c.withdraw(12000));

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            c.deposit(3000);
        });

        t1.start();
        t2.start();
    }
}