public class CalcAverageGrade {

    public static boolean betterThanAverage ( int[] classPoints, int yourPoints){

        float total = 0.0f;
        boolean result = false;

        for ( int v : classPoints){

            total += v;
        }

        if ( yourPoints > total / classPoints.length)
            result =  true;
        else
            result = false;

        return result;
    }
}
