public class reverse_integer_j {

    public int reverse_integer(int a) {
        /*
        * Takes as input an integer and returns the reversed number. If number overflows on reversal then 0 is returned*/
        int temp = a;
        int reverse = 0;

        //reverse teh number
        while (a != 0) {
            reverse = reverse * 10;
            reverse = reverse + a %10;
            a = a / 10;
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



    }
}
