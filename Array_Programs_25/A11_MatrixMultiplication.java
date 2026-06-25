import java.util.Scanner;

public class A11_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of A and cols of A (= rows of B): ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        System.out.print("Enter cols of B: ");
        int c2 = sc.nextInt();
        int[][] a = new int[r1][c1], b = new int[c1][c2], res = new int[r1][c2];
        System.out.println("Enter Matrix A (" + r1 + "x" + c1 + "):");
        for (int i = 0; i < r1; i++) for (int j = 0; j < c1; j++) a[i][j] = sc.nextInt();
        System.out.println("Enter Matrix B (" + c1 + "x" + c2 + "):");
        for (int i = 0; i < c1; i++) for (int j = 0; j < c2; j++) b[i][j] = sc.nextInt();
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++) res[i][j] += a[i][k] * b[k][j];
        System.out.println("Result Matrix:");
        for (int[] row : res) { for (int v : row) System.out.print(v + "\t"); System.out.println(); }
        sc.close();
    }
}
