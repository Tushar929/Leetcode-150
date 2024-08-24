class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        // Example test case
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        // Create an instance of the Solution class
        RemoveElement_27 obj = new RemoveElement_27();
        int newLength = obj.removeElement(nums, val);

        // Print the result
        System.out.println("New length after removing " + val + ": " + newLength);
        System.out.print("Array after removal: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
