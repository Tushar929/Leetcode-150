import java.util.HashMap;
import java.util.HashSet;

public class WordPattern_290 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        String[] input = s.split(" ");

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = input[i];

            if (map.containsKey(currentChar)) {
                if (!currentWord.equals(map.get(currentChar))) {
                    return false;
                }
            } else {
                if (set.contains(currentWord)) {
                    return false;
                }
                set.add(currentWord);
                map.put(currentChar, currentWord);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern_290 solution = new WordPattern_290();
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(solution.wordPattern(pattern, s)); // Should print true
    }
}
