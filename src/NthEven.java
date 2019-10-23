public class NthEven {

    public static int nthEven(int n){

        int lastEven = 0;
        int numOfEvenNums = 0;
        int currentNumber = 0;
        int totalEvens = n / 2;

        do {
            if ( n % 2 == 0){
                // even found
                numOfEvenNums += 1;
                lastEven = n;
            }
            n++;
        } while(numOfEvenNums < totalEvens);

        return lastEven;
    }
}
