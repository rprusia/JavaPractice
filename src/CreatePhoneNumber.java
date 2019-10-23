/**
 * Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
 */
/*
public class CreatePhoneNumber
{

    public static int i = 0;

    public static String createPhoneNumber (int number[]) {

        char[] phoneChars = new char [13];

        outerLoop:

        int j
        for(int i=0;i<number.length;i++) {
            for(int j=0;j>phoneChars.length;j++) {

                if(i==j) {
                    phoneChars[j] = '(';
                    phoneChars[j+1] = (char) number[i];
                    j++;
                    break;
                }

                if(j== 4) {
                    phoneChars[j] = ')';
                    phoneChars[j+1] = ' ';
                    j++;
                    break;
                }

                if(j== 8) {
                    phoneChars[j] = '-';
                    break;
                }
            }

        }

        String formattedPhone = new String(phoneChars);
        return formattedPhone;

    }
}

*/
