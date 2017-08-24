public class ReverseInteger_optimized {
    public static int reverseInteger(int n) {
        long reverse = 0;

        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;

            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int)reverse;
    }

    public static void main(String args[]) {
        System.out.println(reverseInteger(-123));

    }
}