public class IsSubsequence_392 {
    public static void main(String[] args) {
        IsSubsequence_392 solution = new IsSubsequence_392();

        String s = "abc";
        String t = "ahbgdc";

        boolean result = solution.isSubsequence(s, t);
        System.out.println("Is subsequence? " + result);
    }

    public boolean isSubsequence(String s, String t) {
        if (t.length() < s.length()) {
            return false;
        }

        int i = 0;
        int j = 0;

        while (j < t.length()) {
            if (i < s.length() && s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
