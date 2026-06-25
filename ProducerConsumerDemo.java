class Buffer {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) throws Exception {
        while (available)
            wait();

        data = value;
        available = true;

        System.out.println("Produced : " + value);

        notify();
    }

    public synchronized int consume() throws Exception {
        while (!available)
            wait();

        available = false;

        System.out.println("Consumed : " + data);

        notify();

        return data;
    }
}

class Producer extends Thread {
    Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.produce(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.consume();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        new Producer(buffer).start();
        new Consumer(buffer).start();
    }
}