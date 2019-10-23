public class SurfaceAreaAndVolume {

    public static int[] getSize(int w, int h, int d) {

        int area = 2* (h * w) + 2*(h * d) + 2*(w * d);
        int volume = w * h * d;

        int[] result = new int [2] ;

        result[0] = area;
        result[1] = volume;
        return result;

    }
}
