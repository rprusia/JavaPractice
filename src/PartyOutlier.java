public class PartyOutlier {

    /**
     * You are given an array (which will have a length of at least 3,
     * but could be very large) containing integers. The array is either
     * entirely comprised of odd integers or entirely comprised of even
     * integers except for a single integer N.
     * <p>
     * Write a method that takes the array as an argument and returns this "outlier" N.
     */


    static int find(int[] integers) {
        int evenNums = 0;
        int oddNums = 0;
        int result = 0;

        for (int i : integers) {

            // count number of odo
            if ((i % 2) == 0) {

                evenNums += 1;

            } else {

                oddNums += 1;

            }

        }

        if (oddNums == 1) {
            // find odd value
            for (int i : integers) {

                // count number of odo
                if ((i % 2) != 0) {

                    result = i;

                }

            }
        } else {
            for (int i : integers) {

                if ((i % 2) == 0) {

                    result = i;

                }

            }


        }

        return result;

    }
}
