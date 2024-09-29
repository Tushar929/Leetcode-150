public class SQRTx_69 {
    public static void main(String[] args) {
        SQRTx_69 solution = new SQRTx_69();
        int x = 8;
        int result = solution.mySqrt(x);
        System.out.println("Square root of " + x + " is: " + result);
    }

    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            long midSquared = (long) mid * mid;

            if (midSquared == x) {
                return mid;
            } else if (midSquared < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }
}
