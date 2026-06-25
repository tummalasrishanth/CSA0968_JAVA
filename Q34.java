public class Q34 {
    public static void main(String[] args) {

        int n = 4;

        int limit = n * 2;

        int a = 0, b = 1;
        int sum = 0;

        for(int i = 0; i <= limit; i++) {

            int current;

            if(i == 0)
                current = 0;
            else if(i == 1)
                current = 1;
            else {
                current = a + b;
                a = b;
                b = current;
            }

            if(i % 2 == 0)
                sum += current;
        }

        System.out.println("Sum = " + sum);
    }
}