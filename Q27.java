public class Q27 {
    public static void main(String[] args) {

        int rows = 3;

        for(int i=rows;i>=1;i--) {

            for(int s=rows-i;s>=0;s--)
                System.out.print(" ");

            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");

            System.out.println();
        }
    }
}