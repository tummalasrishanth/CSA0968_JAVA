public class Q19 {
    public static void main(String[] args) {

        int num = 1;
        int max = 3;

        for(int i=1;i<=max;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(num);
            }
            System.out.println();
        }

        for(int i=max-1;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}