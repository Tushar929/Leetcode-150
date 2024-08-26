public class palindrome_9 {
    public boolean isPalindrome(int x) {
        if (x == 0) return true;

        if (x < 0 || x % 10 == 0) return false;

        int reverse = 0;
        while (x > reverse) {
            int pop = x % 10;
            x /= 10;

            reverse = (reverse * 10) + pop;
        }
        return x == reverse || x == reverse / 10;
    }

    public static void main(String[] args) {
        palindrome_9 solution = new palindrome_9();

        int num1 = 121;
        int num2 = -121;
        int num3 = 10;

        System.out.println(num1 + " is palindrome: " + solution.isPalindrome(num1));  // true
        System.out.println(num2 + " is palindrome: " + solution.isPalindrome(num2));  // false
        System.out.println(num3 + " is palindrome: " + solution.isPalindrome(num3));  // false
    }
}
