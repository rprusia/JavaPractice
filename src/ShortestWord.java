public class ShortestWord {

    /**
     * Simple, given a string of words, return the length of the shortest word(s).
     * String will never be empty and you do not need to account for different data types
     * @param s
     * @return
     */
    public static int findShort(String s){
        int shortestLength = 0;
        int currentLength = 0;

        shortestLength = s.length();
        for (String word : s.split("\\s+")){

            if (shortestLength > word.length() ){
                shortestLength = word.length();
            }
        }

        return shortestLength;
    }
}
