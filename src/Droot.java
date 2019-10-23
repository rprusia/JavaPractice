public class Droot {

    /**
     * In this kata, you must create a digital root function.
     * A digital root is the recursive sum of all the digits in a number.
     * Given n, take the sum of the digits of n. If that value has two digits,
     * continue reducing in this way until a single-digit number is produced.
     * This is only applicable to the natural numbers.
     *
     * _root(16)
     * => 1 + 6
     * => 7
     *
     * digital_root(942)
     * => 9 + 4 + 2
     * => 15 ...
     * => 1 + 5
     * => 6
     */
    public static int digital_root(int n) {

        int result = 0;
        if (n < 10)
        {
            return n;
        }

        int sum = 0;
        while (n > 0)
        {
            sum += n % 10;
            n = n / 10;
        }
        return digital_root(sum);
    }


}

