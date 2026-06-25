import java.util.*;

public class A24_EvenBeforeOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Original : " + Arrays.toString(arr));
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] % 2 == 0) left++;
            while (left < right && arr[right] % 2 != 0) right--;
            if (left < right) { int temp = arr[left]; arr[left] = arr[right]; arr[right] = temp; }
        }
        System.out.println("Rearranged (Even before Odd): " + Arrays.toString(arr));
    }
}
