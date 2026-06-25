class ElectricityBill {

    int consumerNo;
    String consumerName;
    int previousReading;
    int currentReading;

    ElectricityBill(int consumerNo, String consumerName,
            int previousReading, int currentReading) {

        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

    void generateBill() {

        if (previousReading < 0 || currentReading < 0 ||
                currentReading < previousReading) {
            System.out.println("Invalid Input");
            return;
        }

        int units = currentReading - previousReading;
        double bill;

        if (units <= 100) {
            bill = units * 1.0;
        } else if (units <= 200) {
            bill = units * 2.5;
        } else if (units <= 500) {
            bill = units * 4.0;
        } else {
            bill = units * 6.0;
        }

        System.out.println("Consumer No   : " + consumerNo);
        System.out.println("Consumer Name : " + consumerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Bill Amount   : Rs." + bill);
    }
}

public class q20 {

    public static void main(String[] args) {

        ElectricityBill eb = new ElectricityBill(
                101,
                "Raja",
                1200,
                1550);

        eb.generateBill();
    }
}