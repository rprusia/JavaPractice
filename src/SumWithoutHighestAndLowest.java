public class SumWithoutHighestAndLowest {

    public static int sum(int[] numbers)
    {
        int lowestVal = 0;
        int highestVal = 0;
        int total = 0;
        boolean addExtraHigh = false;
        boolean addExtraLow = false;


        if ((numbers == null) || (numbers.length == 1)){
            return 0;
        }

        // find Lowest
        for (int i = 0; i < numbers.length; i++){

            if ( i == 0 ){
                lowestVal = numbers[i];
            }
            else if ( lowestVal > numbers[i]){
                lowestVal = numbers[i];
            }
        }

        // find Lowest
        for (int j = 0; j < numbers.length; j++){

            if ( j == 0 ){
                highestVal = numbers[j];
            }
            else if ( highestVal < numbers[j]){
                highestVal = numbers[j];
            }
        }

        // add values
        for (int x : numbers){

            if ((x == lowestVal) && (addExtraLow == false )){
                addExtraLow = true;
                continue;
            }
            else if ((x == highestVal) && (addExtraHigh == false )){
                addExtraHigh = true;
                continue;
            }
            else {
                total += x;
            }
        }


        return total;
    }

}
