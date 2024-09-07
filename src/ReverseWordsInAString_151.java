public class ReverseWordsInAString_151 {
    public String reverseWords(String s) {
        String words[] = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() > 0) {
                sb.append(words[i]);
                sb.append(" ");
            }
        }
        return sb.substring(0, sb.length() - 1).toString();
    }

    public static void main(String[] args) {
        ReverseWordsInAString_151 solution = new ReverseWordsInAString_151();
        String input = "  Hello World  ";
        String result = solution.reverseWords(input);
        System.out.println("Reversed words: " + result);
    }
}
