import java.util.Scanner;

public class MinimumSizeSubArraySum_209 {

    // Method to find the minimum size of a subarray with sum >= target
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0; // Left pointer (start of the window)
        int j = 0; // Right pointer (end of the window)
        int sum = 0; // Current sum of the subarray
        int min = Integer.MAX_VALUE; // Stores the length of the smallest subarray found

        // Loop through the array using the right pointer 'j'
        while (j < nums.length) {
            sum += nums[j]; // Add the current element to the sum

            // Shrink the window from the left as long as the sum is greater than or equal to the target
            while (sum >= target) {
                // Update the minimum length of the subarray
                min = Math.min(min, (j - i + 1));
                sum -= nums[i]; // Subtract the element at the left pointer
                i++; // Move the left pointer to shrink the window
            }
            j++; // Move the right pointer to explore more elements
        }

        // If no valid subarray is found, return 0
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    // Main method to test the function
    public static void main(String[] args) {
        MinimumSizeSubArraySum_209 solution = new MinimumSizeSubArraySum_209();
        Scanner scanner = new Scanner(System.in);

        // Input target
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input array elements
        int[] nums = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Find and display the result
        int result = solution.minSubArrayLen(target, nums);
        System.out.println("The minimum length of the subarray is: " + result);
    }
}
