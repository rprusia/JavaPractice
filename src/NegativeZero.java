public class NegativeZero extends Throwable {

    /**
     * There exist two zeroes: +0 (or just 0) and -0.
     * Write a function that returns true if the input number is -0 and
     * false otherwise (True and False for Python).
     * In JavaScript / TypeScript / Coffeescript the input will be a number.
     * In Python / Java / C the input will be a float.

     */
    public static boolean isNegativeZero (float n){

        // Enjoy!
        if(Float.toString(n).equals("-0.0")){
            return true;
        }
        return false;





    }

}
