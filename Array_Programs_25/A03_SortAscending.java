import java.util.*;

public class A03_SortAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Before Sort : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Ascending   : " + Arrays.toString(arr));
        sc.close();
    }
}
