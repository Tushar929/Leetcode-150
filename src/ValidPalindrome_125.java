public class ValidPalindrome_125 {
    public static void main(String[] args) {
        ValidPalindrome_125 solution = new ValidPalindrome_125();
        String testString = "A man, a plan, a canal: Panama";
        boolean result = solution.isPalindrome(testString);
        System.out.println("Is palindrome? " + result);
    }

    public boolean isPalindrome(String s) {
        int n = s.length();
        if (n == 0) {
            return true;
        }
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            char currentFirst = s.charAt(start);
            char currentLast = s.charAt(end);
            if (!Character.isLetterOrDigit(currentFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currentLast)) {
                end--;
            } else {
                if (Character.toLowerCase(currentFirst) != Character.toLowerCase(currentLast)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
