public class RomanToInteger_13 {
    public int romanToInt(String s) {
        int ans = 0;
        int num = 0;
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            num = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> num;
            };
            if (4 * num < ans) {
                ans -= num;
            } else {
                ans += num;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        RomanToInteger_13 converter = new RomanToInteger_13();
        String roman = "MCMXCIV";
        int result = converter.romanToInt(roman);
        System.out.println("The integer value of " + roman + " is " + result);
    }
}
