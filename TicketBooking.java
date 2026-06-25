class Ticket {
    int tickets = 0;

    synchronized void bookTicket() {
        while (tickets == 0) {
            try {
                System.out.println("No tickets available. Waiting...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        tickets--;
        System.out.println("Ticket Booked. Remaining: " + tickets);
    }

    synchronized void cancelTicket() {
        tickets++;
        System.out.println("Ticket Cancelled. Available: " + tickets);
        notify();
    }
}

public class TicketBooking {
    public static void main(String[] args) {

        Ticket t = new Ticket();

        new Thread(() -> t.bookTicket()).start();

        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
            t.cancelTicket();
        }).start();
    }
}