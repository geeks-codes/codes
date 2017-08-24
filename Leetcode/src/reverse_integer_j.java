public class reverse_integer_j {

    public static int reverse_integer(int a) {
        /*
        * Takes as input an integer and returns the reversed number. If number overflows on reversal then 0 is returned*/
        int temp = a;
        int reverse = 0;
        long temp_reverse = 0;

        //reverse the number
        while (a != 0) {
            reverse = reverse * 10;
            reverse = reverse + a %10;
            temp_reverse = temp_reverse * 10;
            temp_reverse = (long) temp_reverse + a % 10;
            a = a / 10;
        }

        //check if reversed integer is same as a reversed long
        if(temp_reverse != reverse) {
            return 0;
        }

        //check for overflow
        if ((temp > 0 && reverse < 0) || (temp   < 0 && reverse > 0)) {
            return 0;
        }

        else {
            return reverse;
        }
    }

    public static void main(String arg[]) {
        int a = reverse_integer(1534236469);

        System.out.println(a);


    }
}
