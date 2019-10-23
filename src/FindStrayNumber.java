import java.util.Arrays;

public class FindStrayNumber {

    // odd-length array of ints, all the same, but one
    // returns that single diff number

    public int findDiffNumber(int[] numbers) {

            Arrays.sort(numbers);
            int disctinctNum = numbers[numbers.length-1];

            if (numbers[numbers.length -2] == numbers[numbers.length -1] ){
                disctinctNum = numbers[0];
            }
            else
            {
                disctinctNum = numbers[numbers.length-1];

            }

        return disctinctNum;
    }

}