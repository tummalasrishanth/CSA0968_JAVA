public class q19 {

    public static void main(String[] args) {

        double income = 600000; // Direct Input

        if (income < 0) {
            System.out.println("Invalid Input");
            return;
        }

        double taxableIncome = 0;
        double tax = 0;

        if (income <= 250000) {
            taxableIncome = 0;
            tax = 0;
        } else if (income <= 500000) {
            taxableIncome = income - 250000;
            tax = taxableIncome * 0.10;
        } else if (income <= 1000000) {
            taxableIncome = income - 250000;
            tax = taxableIncome * 0.10;
        } else {
            taxableIncome = income - 250000;
            tax = taxableIncome * 0.30;
        }

        System.out.println("Taxable Income: " + (int) taxableIncome);
        System.out.println("Tax = " + (int) tax);
    }
}