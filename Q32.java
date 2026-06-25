public class Q32 {

    static double calculateSI(double principal, int years, boolean senior) {

        double rate;

        if(senior)
            rate = 12;
        else
            rate = 10;

        return (principal * years * rate) / 100;
    }

    public static void main(String[] args) {

        double principal = 200000;
        int years = 3;
        boolean seniorCitizen = false;

        double interest =
                calculateSI(principal, years, seniorCitizen);

        System.out.println("Interest = " + interest);
    }
}