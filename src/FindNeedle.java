public class FindNeedle {

    public static String findNeedle(Object[] haystack) {
        // Your code here
        int counter = 0;

        for (int i = 0; i < haystack.length;i++)
        {
            if (haystack[i] != null) {
                if (haystack[i].toString().equalsIgnoreCase("needle") ){
                    break;
                }

            }
            counter += 1;

        }

        return "found the needle at position " + counter;
    }


    public static String bestPractice(Object[] haystack) {

        return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
    }

}
