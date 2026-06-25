public class Q40 {
    public static void main(String[] args) {

        int num = 6;

        int sum = 0;

        for(int i = 1; i < num; i++) {
            if(num % i == 0)
                sum += i;
        }

        if(sum == num)
            System.out.println("It's a Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}