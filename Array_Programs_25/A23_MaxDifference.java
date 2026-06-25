import java.util.*;

public class A23_MaxDifference {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        int maxDiff = Integer.MIN_VALUE;
        int minElement = arr[0];
        int a = arr[0], b = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - minElement > maxDiff) {
                maxDiff = arr[i] - minElement;
                a = minElement; b = arr[i];
            }
            if (arr[i] < minElement) minElement = arr[i];
        }
        System.out.println("Array           : " + Arrays.toString(arr));
        System.out.println("Maximum Diff    : " + maxDiff + " (between " + b + " and " + a + ")");
    }
}
