public class Q37 {
    public static void main(String[] args) {

        int n = 4;

        long fact = 1;

        for(int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println(n + " Factorial = " + fact);
    }
}