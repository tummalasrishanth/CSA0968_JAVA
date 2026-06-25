public class q27 {

    int[] nums;

    public q27(int[] nums) {
        this.nums = nums;
    }

    public void update(int index, int val) {
        nums[index] = val;
    }

    public int sumRange(int left, int right) {
        int sum = 0;

        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        q27 numArray = new q27(new int[] { 1, 3, 5 });

        System.out.println(numArray.sumRange(0, 2)); // 9

        numArray.update(1, 2);

        System.out.println(numArray.sumRange(0, 2)); // 8
    }
}