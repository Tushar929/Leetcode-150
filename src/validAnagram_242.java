import java.util.Arrays;

public class validAnagram_242 {

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String s, String t) {
        // Step 1: Check if the lengths are different
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Convert both strings to char arrays and sort them
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Step 3: Compare the sorted char arrays
        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        // Example test cases
        String s = "listen";
        String t = "silent";

        // Calling the isAnagram method and printing the result
        boolean result = isAnagram(s, t);
        System.out.println("Are the strings anagrams? " + result);
    }
}
