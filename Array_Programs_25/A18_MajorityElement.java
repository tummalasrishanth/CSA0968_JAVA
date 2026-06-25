import java.util.*;

public class A18_MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int n = nums.length;
        // Boyer-Moore Voting Algorithm
        int candidate = nums[0], count = 1;
        for (int i = 1; i < n; i++) {
            if (count == 0) { candidate = nums[i]; count = 1; }
            else if (nums[i] == candidate) count++;
            else count--;
        }
        // Verify
        int freq = 0;
        for (int num : nums) if (num == candidate) freq++;
        System.out.println("Array: " + Arrays.toString(nums));
        if (freq > n / 2) System.out.println("Majority Element: " + candidate + " (appears " + freq + " times)");
        else System.out.println("No majority element found.");
    }
}
