public class rotateArray_189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (n == 0) {
            return;
        }
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        rotateArray_189 solution = new rotateArray_189();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        solution.rotate(nums, k);

        // Print the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
