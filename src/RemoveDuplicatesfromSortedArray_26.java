class RemoveDuplicatesfromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        // Example test case
        int[] nums = {1, 1, 2, 2, 3, 3, 4};

        // Create an instance of the class
        RemoveDuplicatesfromSortedArray_26 solution = new RemoveDuplicatesfromSortedArray_26();
        int newLength = solution.removeDuplicates(nums);

        // Print the result
        System.out.println("New length after removing duplicates: " + newLength);
        System.out.print("Array after removal: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
