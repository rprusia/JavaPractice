
public class OrderString {

    /**
     *
     * Your task is to sort a given string. Each word in the string will contain a single number.
     * This number is the position the word should have in the result.
     * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
     * If the input string is empty, return an empty string. The words in the
     * input String will only contain valid consecutive numbers.
     */

    public static String order(String words) {
        // ...
        String[]  splitWords = words.split(" ");
        String[] temp = new String [splitWords.length];
        StringBuilder sbResult = new StringBuilder();

        Integer count  = 1;

        for (Integer i = 0; i < splitWords.length; i++){  // loop thru all words

            for (Integer j = 0; j < splitWords.length; j++){

                if ( splitWords[j].contains(count.toString())){

                    sbResult.append(splitWords[j] + " ");
                    break;
                }

            }
            count += 1;

        }

        return sbResult.toString().trim();

    }
}

