public class Q12 {
    public static void main(String[] args) {

        int a[][] = {{1,2},{5,3}};
        int b[][] = {{2,3},{4,1}};
        int c[][] = new int[2][2];

        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Matrix Addition:");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
