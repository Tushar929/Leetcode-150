public class LengthofLastWord_58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int index = -1;
        if (s.length() == 1)
            return 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                index = i;
                break;
            }
        }
        if (index == -1)
            return s.length();
        String res = s.substring(index + 1, s.length());
        return res.length();
    }

    public static void main(String[] args) {
        LengthofLastWord_58 obj = new LengthofLastWord_58();
        String s = "Hello World"; // Example input
        int result = obj.lengthOfLastWord(s);
        System.out.println("The length of the last word is: " + result);
    }
}
