import java.util.Scanner;

public class A12_TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) mat[i][j] = sc.nextInt();
        System.out.println("Original Matrix:");
        for (int[] row : mat) { for (int v : row) System.out.print(v + "\t"); System.out.println(); }
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) System.out.print(mat[j][i] + "\t");
            System.out.println();
        }
        sc.close();
    }
}
