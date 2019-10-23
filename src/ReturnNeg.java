public class ReturnNeg {

    public static int makeNegative(final int x){
        int result = 0;
        if (x >=0){
            result = x * -1;
        }
        else {
            result =  x;
        }
        return result;
    }
}
