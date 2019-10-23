public class InvertValues {

    public static int[] invert( int[] arr){

        int[] result = new int[arr.length];
        int i = 0;
        for (int val : arr ){

            if (val > 0) {
                result[i] = val * -1;
            }
            else {
                result[i] = Math.abs(val);
            }
            i++;
        }
        return result;
    }
}
