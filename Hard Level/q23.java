class Addition extends Thread {
    int a, b;

    Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Addition = " + (a + b));
    }
}

class Subtraction extends Thread {
    int a, b;

    Subtraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Subtraction = " + (a - b));
    }
}

class Multiplication extends Thread {
    int a, b;

    Multiplication(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Multiplication = " + (a * b));
    }
}

class Division extends Thread {
    int a, b;

    Division(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Division by zero not possible");
    }
}

public class q23 {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 10;

        Addition t1 = new Addition(num1, num2);
        Subtraction t2 = new Subtraction(num1, num2);
        Multiplication t3 = new Multiplication(num1, num2);
        Division t4 = new Division(num1, num2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}