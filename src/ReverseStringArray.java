public class ReverseStringArray {

    public static String[] fixTheMeerKat(String[] arr){

        String[] s = new String[3];

        s[2] = arr[0];
        s[0] = arr[2];
        s[1] = arr[1];

        return s;
    }
}
