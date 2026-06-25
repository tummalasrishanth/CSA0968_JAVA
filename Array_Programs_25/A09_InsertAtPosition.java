import java.util.*;

public class A09_InsertAtPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter position (0-indexed): ");
        int pos = sc.nextInt();
        System.out.print("Enter element to insert: ");
        int val = sc.nextInt();
        for (int i = n; i > pos; i--) arr[i] = arr[i - 1];
        arr[pos] = val;
        System.out.println("After insertion: " + Arrays.toString(arr));
        sc.close();
    }
}
