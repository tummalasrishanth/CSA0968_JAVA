import java.util.Scanner;

public class A17_SumOfDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) mat[i][j] = sc.nextInt();
        int primary = 0, secondary = 0;
        for (int i = 0; i < n; i++) { primary += mat[i][i]; secondary += mat[i][n - 1 - i]; }
        System.out.println("Primary Diagonal Sum   : " + primary);
        System.out.println("Secondary Diagonal Sum : " + secondary);
        sc.close();
    }
}
