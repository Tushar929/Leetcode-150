public class MaximumSubarray_53 {
    public static void main(String[] args) {
        MaximumSubarray_53 solution = new MaximumSubarray_53();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + solution.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;
        for (int i : nums) {
            currSum += i;
            maxSum = currSum > maxSum ? currSum : maxSum;
            if (currSum < 0) currSum = 0;
        }
        return maxSum;
    }
}
