import java.util.Arrays;

public class FakeBinary {

    public static String fakeBin( String numberString ){

        int value =0;
        char [] newArray = new char[numberString.length()];

        for (int i = 0; i < numberString.length(); i++)
        {

            if (numberString.charAt(i) < 53)
            {
                //numberString.replace(numberString.charAt(i), '0');
                newArray[i] = '0';
            }
            else
            {
                //numberString.replace(numberString.charAt(i), '1');
                newArray[i] = '1';
            }

        }

        String myString = String.copyValueOf(newArray);
        return myString;
    }

}
