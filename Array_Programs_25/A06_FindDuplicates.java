import java.util.*;

public class A06_FindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) duplicates.add(num);
        }
        if (duplicates.isEmpty()) System.out.println("No duplicate elements found.");
        else System.out.println("Duplicate elements: " + duplicates);
        sc.close();
    }
}
