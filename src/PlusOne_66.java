public class PlusOne_66 {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        PlusOne_66 obj = new PlusOne_66();
        int[] digits = {1,2,9};
        int[] result = obj.plusOne(digits);
        System.out.println(java.util.Arrays.toString(result));
    }
}
