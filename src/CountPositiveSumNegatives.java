public class CountPositiveSumNegatives {

    public static int[] countPositivesSumNegatives(int[] input)
    {
        int positives =0;
        int sumNegNums = 0;
        int [] result = new int[2];


        if ((input == null) || (input.length == 0 )){

            int [] empty = new int[0];
            return empty;

        }
        else {

            for (int i = 0; i < input.length; i++) {

                if (input[i] > 0) {
                    positives += 1;
                } else {
                    sumNegNums += input[i];
                }
            }

            result[0] = positives;
            result[1] = sumNegNums;

        }


        return result; //return an array with count of positives and sum of negatives
    }
}