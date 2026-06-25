public class q11 {

    public static void main(String[] args) {

        int n = 3; // Direct Input

        if (n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        System.out.print("[");

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("\"FizzBuzz\"");
            } else if (i % 3 == 0) {
                System.out.print("\"Fizz\"");
            } else if (i % 5 == 0) {
                System.out.print("\"Buzz\"");
            } else {
                System.out.print("\"" + i + "\"");
            }

            if (i < n) {
                System.out.print(",");
            }
        }

        System.out.println("]");
    }
}