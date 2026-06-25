import java.util.Scanner;

public class A14_LargestSmallestMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) mat[i][j] = sc.nextInt();
        int max = mat[0][0], min = mat[0][0];
        for (int[] row : mat) for (int v : row) { if (v > max) max = v; if (v < min) min = v; }
        System.out.println("Largest  element: " + max);
        System.out.println("Smallest element: " + min);
        sc.close();
    }
}
