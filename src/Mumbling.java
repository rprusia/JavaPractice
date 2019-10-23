/**
 * Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
 * Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
 */
public class Mumbling {

    public static String accum(String s) {

        StringBuilder resultBuilder = new StringBuilder();
        Character temp =null;

       for (int i = 0; i < s.length(); i++)  {

           // loop through all values.
           if ( i == 0) {
               temp = Character.toUpperCase(s.charAt(0));
               resultBuilder.append(temp).append('-');
           }
           else {

               for (int j = 0; j <= i; j++){

                   if (j == 0 ) {
                       // first char make  upper case.
                       temp = Character.toUpperCase(s.charAt(i));
                       resultBuilder.append(temp);
                   }
                   else if (j < i ) {
                       temp = Character.toLowerCase(s.charAt(i));
                       resultBuilder.append(temp);
                   }
                   else {
                       temp = Character.toLowerCase(s.charAt(i));
                       if ( i == s.length() - 1) {
                           // end of array don't append the dash
                           resultBuilder.append(temp);
                       }
                       else{
                            resultBuilder.append(temp).append('-');
                       }

                   }
               }
           }

       }
       String result = new String(resultBuilder);

       return result;
    }
}
