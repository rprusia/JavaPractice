/**
 * two arguments, fathers age, and son's age
 * Сalculate how many years ago the father was twice as old as his son
 * (or in how many years he will be twice as old).
 */
public class TwiceAsOld {

    public static int twiceAsOld(int dadYears, int sonYears) {

        int counter =0;
        int son = sonYears;
        int dad = dadYears;
        int result = 0;

        // Сalculate how many years ago the father was twice as old as
        // his son (or in how many years he will be twice as old).
        while (son * 2 != dad) {

            son -= 1;
            dad -= 1;
            counter += 1;

            if (son < 0) {
                counter = 0;
                break;
            }

        }

        if ( son * 2 != dad ){
            counter = 0;
            while (sonYears * 2 != dadYears) {

                sonYears += 1;
                dadYears +=1;
                counter += 1;

            }

        }

        return counter;

    }

}
