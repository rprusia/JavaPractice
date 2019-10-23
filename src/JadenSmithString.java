import java.lang.StringBuilder;
import java.lang.String;

public class JadenSmithString {

    public static void main(String args[]) {

        toJadenCase(null);
    }

    public static String toJadenCase(String phrase) {

        if (phrase == null || phrase.length() == 0)
        {
            return null;
        }

        String[] arrOfStr = phrase.split(" ");
        String[] result = new String[arrOfStr.length];
        StringBuilder finalString = new StringBuilder();
        int i = 0;

        if (phrase != null) {
            for (String a : arrOfStr) {

                result[i] = a.substring(0, 1).toUpperCase() + a.substring(1);
                finalString.append(result[i]  + " ");
                i++;

            }
        }

        System.out.println(finalString);
        return finalString.toString().trim();
    }
}

