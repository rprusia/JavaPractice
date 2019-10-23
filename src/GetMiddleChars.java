public class GetMiddleChars {
    /**
    *
     Get the Middle Character
     You are going to be given a word. Your job is to return the middle character of the word.
     If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
     */
    public static String getMiddle(String word) throws Exception {
        //Code goes here!
        char[] result = new char[2];
        char[] oddResult = new char[1];
        String ans;

        if (word.length() % 2 == 0 ) {
            // return middle two chars
            int i = word.length()/2 - 1;
            result[0] = (char) word.charAt(i);
            result[1] = (char) word.charAt(i+1);
            ans = new String(result);
        }
        else {
            // return testing char
            int j = word.length()/2;
            oddResult[0]  = (char) word.charAt(j);
            ans = new String(oddResult);
        }

        return ans;
    }


}
