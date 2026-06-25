import java.util.*;

public class A22_RotateArray {
    static void reverse(int[] arr, int l, int r) {
        while (l < r) { int tmp = arr[l]; arr[l++] = arr[r]; arr[r--] = tmp; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("Enter K (positions to rotate right): ");
        int k = sc.nextInt();
        int n = arr.length;
        k = k % n;
        System.out.println("Original : " + Arrays.toString(arr));
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        System.out.println("Rotated  : " + Arrays.toString(arr));
        sc.close();
    }
}
