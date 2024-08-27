public class palindrome_9 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;

        int reverse = 0;
        while (x > reverse) {
            int og = x % 10;
            x /= 10;

            reverse = (reverse * 10) + og;
        }
        return x == reverse || x == reverse / 10;
    }

    public static void main(String[] args) {
        palindrome_9 obj = new palindrome_9();

        // Test cases
        int[] testCases = {121, -121, 10, 12321, 0};

        for (int num : testCases) {
            System.out.println(num + " is palindrome: " + obj.isPalindrome(num));
        }
    }
}
