public class Q36 {
    public static void main(String[] args) {

        int A = 12;
        int B = 19;

        for(int num = A; num <= B; num++) {

            int count = 0;

            for(int i = 1; i <= num; i++) {
                if(num % i == 0)
                    count++;
            }

            if(count > 2)
                System.out.print(num + " ");
        }
    }
}