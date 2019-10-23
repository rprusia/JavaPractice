public class ParseChar {
    public static int howOld(final String herOld) {

        char c = herOld.charAt(0);  // returns 'l'
        return Character.getNumericValue(c);
    }
}