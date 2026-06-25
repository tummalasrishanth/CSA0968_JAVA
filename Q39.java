public class Q39 {
    public static void main(String[] args) {

        int num = 100;

        int count = 0;

        for(int i = 1; i <= num; i++) {
            if(num % i == 0)
                count++;
        }

        System.out.println("Number of Factors = " + count);
    }
}