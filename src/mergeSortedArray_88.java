import java.util.Arrays;

class mergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        // Example test case
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        // Create an instance of the Solution class
        mergeSortedArray_88 obj = new mergeSortedArray_88();
        obj.merge(nums1, m, nums2, n);

        // Print the result
        System.out.println("Merged array: " + Arrays.toString(nums1));
    }
}
