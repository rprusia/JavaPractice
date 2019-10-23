import java.util.Arrays;

public class HighestLowestString {

    /**
     * you are given a string of numbers separated by numbers
     * return the highest and lowest number in a string.
     * @param numbers
     * @return
     */

    public static String HighAndLow(String numbers) {


       String[] splitValues = numbers.split("\\s+");

       char[] result = new char[3];
       Integer highVal = 0;
       Integer lowVal = 0;
       char space = ' ';

       // find highest value
        for (int i = 0; i < splitValues.length; i++) {

            if (( Integer.parseInt(splitValues[i]) > highVal) || ( i == 0)) {
                highVal = Integer.parseInt(splitValues[i]);
            }
        }


        // find lowest value
        for (int j = 0; j < splitValues.length; j++) {

            if (( Integer.parseInt(splitValues[j]) < lowVal ) || ( j == 0)) {
                lowVal = Integer.parseInt(splitValues[j]);
            }
        }


        String x = highVal.toString() + ' ' + lowVal.toString();
        // Code here or
        return x;
    }

}
