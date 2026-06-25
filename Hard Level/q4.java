public class q4 {

    static boolean isPrime(int num) {
        if (num < 2)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 3; // Direct input

        if (n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int count = 0;
        int num = 2;
        int nthPrime = 0;

        while (count < n) {
            if (isPrime(num)) {
                count++;
                nthPrime = num;
            }
            num++;
        }

        System.out.println(n + "rd Prime number is " + nthPrime);
        System.out.print(n + " prime numbers after " + nthPrime + " are: ");

        count = 0;
        num = nthPrime + 1;

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num);
                count++;

                if (count < n) {
                    System.out.print(", ");
                }
            }
            num++;
        }
    }
}