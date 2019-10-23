public class ReverseStringLong{

    public static int[] digitize(long n) {
        // Code here
        String myString = Long.toString(n);
        StringBuffer myStrBuffer = new StringBuffer(myString);
        String revString = new String (myStrBuffer.reverse());
        int[] arr = new int[revString.length()];

        for (int i = 0; i < revString.length(); i++){
           // arr[i] =  Character.revString.charAt(i);
            arr[i] = Integer.parseInt(String.valueOf(revString.charAt(i)));
        }
        return arr;

    }
}
