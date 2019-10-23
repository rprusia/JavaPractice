public class DivisibleByNumber {

    public static long[] divisibleBy(long[] numbers, long divider) {


        int arrSize = 0;

        for ( int i = 0; i < numbers.length; i++){

            if ( numbers[i] % divider == 0 ){
                arrSize++;
            }

        }

        long[] arr = new long[arrSize];
        int j = 0;
            for ( int i = 0; i < numbers.length; i++){

                if ( numbers[i] % divider == 0 ){
                    arr[j] = numbers[i];
                    j++;
                }
            }


        return arr;

    }
}
