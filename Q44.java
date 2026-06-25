public class Q44 {
    public static void main(String[] args) {

        int num = 143;

        while(num > 9) {

            int sum = 0;

            while(num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        System.out.println("Single Digit Sum = " + num);
    }
}