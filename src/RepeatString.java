public class RepeatString {

    public static String repeatStr(final int repeat, final String string) {

        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < repeat; i++) {

            newStr.append(string);
        }

        return newStr.toString();
    }
}

