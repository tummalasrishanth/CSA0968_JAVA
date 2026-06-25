public class Q46 {
    public static void main(String[] args) {

        int n = 27;

        boolean flag = true;

        while(n > 1) {

            if(n % 3 != 0) {
                flag = false;
                break;
            }

            n /= 3;
        }

        System.out.println(flag);
    }
}