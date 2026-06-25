class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        System.out.println();
    }
}

class MyThread extends Thread {
    Table t;
    int num;

    MyThread(Table t, int num) {
        this.t = t;
        this.num = num;
    }

    public void run() {
        t.printTable(num);
    }
}

public class TableDemo {
    public static void main(String[] args) {

        Table t = new Table();

        for (int i = 1; i <= 5; i++) {
            new MyThread(t, i).start();
        }
    }
}