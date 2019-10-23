public class Triangle {

    public static boolean isTriangle ( int a, int b, int c) {
        boolean result = false;

        if ((( a + b) > c ) && (( a + c > b))  &&  (( b + c > a))) {
            return true;
        }
       else {

           return false;
       }


    }
}
