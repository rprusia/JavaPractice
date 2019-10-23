import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Now that the competition gets tough it will Sort out the men from the boys .
 * Men are the Even numbers and Boys are the odd
 *
 * Task
 * Given an array/list [] of n integers , Separate The even numbers from the odds , or Separate the men from the boys
 *
 * Notes
 * Return an array/list where Even numbers come first then odds
 * Since , Men are stronger than Boys , Then Even numbers in ascending order While odds in descending .
 * Array/list size is at least 4 .
 * Array/list numbers could be a mixture of positives , negatives .
 * Have no fear , It is guaranteed that no Zeroes will exists .
 * Repetition of numbers in the array/list could occur , So (duplications are not included when separating).
 */
public class SeperateMenFromBoys {

    public static int[] menFromBoys(final int[] values) {

        int[] dupsRemoved = new int[values.length];
        boolean duplicateFlag = false;
        Arrays.sort(values);
        dupsRemoved = removeDups(values);

        // sort men from boys
        int[] men = new int[countBoysMen(values, "men")];
        int[] boys = new int[countBoysMen(values, "boys")];
        // seperate Even from Odd, ignore duplicates
        men = createArray(dupsRemoved, countBoysMen(dupsRemoved, "men"), "men");
        boys = createArray(dupsRemoved, countBoysMen(dupsRemoved, "boys"), "boys");
        boys = sortArrayDescending(boys);

        //int[] memBoys = combineMenAndBoys(men, boys);
        int[] memBoys = Arrays.copyOf(combineMenAndBoys(men, boys),men.length + boys.length);
        return memBoys;

    }

    public static int[] removeDups(int[] arr) {

        int j = 0;
        int i = 0;

        while (i < arr.length) {

            if (arr[i] == arr[j]) {
                i++;
            } else {
                j++;
                arr[j] = arr[i];
                i++;
            }
        }
        int[] dupsremoved = Arrays.copyOf(arr, j + 1);

        return dupsremoved;
    }

    public static int countBoysMen(int[] arr, String boysOrMen) {

        int count = 0;

        if (boysOrMen.equalsIgnoreCase("men")) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    count++;
                }
            }
        }
            if (boysOrMen.equalsIgnoreCase("boys")) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 != 0) {
                        count++;
                    }
                }
            }
            return count;
        }


    public static int[] createArray(int[] arr ,int size , String boysMen){

        int[] newArr = new int[size];
        int i = 0;
        int j = 0;

        if ( boysMen.toLowerCase() == "men"){
            while(i < arr.length){

                if (arr[i] % 2 == 0) {
                    newArr[j] = arr[i];
                    j++;
                }
                i++;
            }
        }

        if ( boysMen.toLowerCase() == "boys"){
            while(i < arr.length){

                if (arr[i] % 2 != 0) {
                    newArr[j] = arr[i];
                    j++;
                }
                i++;
            }
        }


        return newArr;
    }

    public static int[] sortArrayDescending(int[] arr) {

        int temp;
        for( int i = 0; i < arr.length/2; ++i )
        {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    public static int[] combineMenAndBoys(int[] men, int[] boys){

        int[] menAndBoys = new int[men.length + boys.length] ;

        for ( int i = 0; i < men.length; i++){

            menAndBoys[i] = men[i];
        }

        for ( int i = 0; i < boys.length; i++){

            menAndBoys[men.length +  i] = boys[i];
        }

        return menAndBoys;
    }
}

