public class RemoveDuplicatesfromSortedArrayII_80 {
    public int removeDuplicates(int[] nums) {
        int j = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArrayII_80 obj = new RemoveDuplicatesfromSortedArrayII_80();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength = obj.removeDuplicates(nums);
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
