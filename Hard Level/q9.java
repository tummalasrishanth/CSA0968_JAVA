public class q9 {

    static long reverse(long num) {
        long rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        return rev;
    }

    static boolean isPalindrome(long num) {
        return num == reverse(num);
    }

    public static void main(String[] args) {

        long num = 7325; // Direct Input

        if (num <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        while (!isPalindrome(num)) {
            long rev = reverse(num);
            long sum = num + rev;

            System.out.println(num + " + " + rev + " = " + sum);

            num = sum;
        }

        System.out.println("Palindrome = " + num);
    }
}