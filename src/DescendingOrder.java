import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DescendingOrder {
    /**
     *
     * Your task is to make a function that can take any non-negative integer as a
     * argument and return it with its digits in descending order. Essentially,
     * rearrange the digits to create the highest possible number.
     */

    public static int sortDesc(final int num) {
        //Your code

        int number = num;
        int sorted = 0;
        int digits = 10;
        int sortedDigits = 1;
        boolean first = true;

        while (number > 0) {
            int digit = number % 10;

            if (!first) {

                int tmp = sorted;
                int toDivide = 1;
                for (int i = 0; i < sortedDigits; i++) {
                    int tmpDigit = tmp % 10;
                    if (digit <= tmpDigit) {
                        sorted = sorted/toDivide*toDivide*10 + digit*toDivide + sorted % toDivide;
                        break;
                    } else if (i == sortedDigits-1) {
                        sorted = digit * digits + sorted;
                    }
                    tmp /= 10;
                    toDivide *= 10;
                }
                digits *= 10;
                sortedDigits += 1;
            } else {
                sorted = digit;
            }

            first = false;
            number = number / 10;
        }

        return sorted;
    }

}
