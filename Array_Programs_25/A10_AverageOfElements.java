import java.util.*;

public class A10_AverageOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        double sum = 0;
        for (int num : arr) sum += num;
        System.out.println("Array   : " + Arrays.toString(arr));
        System.out.printf("Average : %.2f%n", sum / n);
        sc.close();
    }
}
