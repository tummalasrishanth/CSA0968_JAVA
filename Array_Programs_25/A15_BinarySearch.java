import java.util.*;

public class A15_BinarySearch {
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        int idx = binarySearch(arr, target);
        if (idx != -1) System.out.println("Element " + target + " found at index: " + idx);
        else System.out.println("Element " + target + " NOT found.");
        sc.close();
    }
}
