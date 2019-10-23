public class FindOddInt {

    /**
     *Given an array, find the int that appears an odd number of times.
     *     There will always be only one integer that appears an odd number of times.
     *
     */

    public static int findIt(int[] a) {

        int count = 0;
        int result = 0;

        for ( int value : a) {

            // loop through complete array
            for (int i = 0; i < a.length; i++) {

                if (value == a[i]) {
                    count++;
                }
            }

            if (count %2 != 0) {
                // odd number times, break
                result = value;
                break;
            }
            count = 0; // reset count.

        }

        return result;
    }
}



