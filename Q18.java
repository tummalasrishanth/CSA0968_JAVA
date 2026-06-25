public class Q18 {
    public static void main(String[] args) {

        char symbol = '#';
        int rows = 4, cols = 6;

        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=cols;j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}