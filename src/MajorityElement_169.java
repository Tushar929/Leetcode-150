public class MajorityElement_169 {

    public static void main(String[] args) {
        MajorityElement_169 obj = new MajorityElement_169();

        // Test case
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = obj.majorityElement_169(nums);

        System.out.println("Majority Element: " + result);
    }

    public int majorityElement_169(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
        }
        count = 0;
        for (int i : nums) {
            if (i == candidate) {
                count++;
            }
        }
        if (count > nums.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
}
