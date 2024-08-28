public class FactorialTrailingZeroes_172 {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n != 0) {
            n /= 5;
            count += n;
        }
        return count;
    }

    public static void main(String[] args) {
        FactorialTrailingZeroes_172 obj = new FactorialTrailingZeroes_172();
        int n = 100;
        int result = obj.trailingZeroes(n);
        System.out.println(result);
    }
}
