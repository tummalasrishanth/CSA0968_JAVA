import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Given Number: ");
        int num = sc.nextInt();

        System.out.print("N = ");
        int n = sc.nextInt();

        if (num <= 0 || n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int factorCount = 0;
        int nthFactor = -1;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorCount++;

                if (factorCount == n) {
                    nthFactor = i;
                }
            }
        }

        System.out.println("Number of factors = " + factorCount);

        if (nthFactor != -1) {
            System.out.println(n + "th factor of " + num + " = " + nthFactor);
        } else {
            System.out.println("Nth factor does not exist");
        }
    }
}