import java.util.*;

public class A19_MaxProductSubarray {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int maxProd = nums[0], minProd = nums[0], result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = maxProd;
            maxProd = Math.max(nums[i], Math.max(maxProd * nums[i], minProd * nums[i]));
            minProd = Math.min(nums[i], Math.min(temp * nums[i], minProd * nums[i]));
            result = Math.max(result, maxProd);
        }
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Maximum Product Subarray: " + result);
    }
}
