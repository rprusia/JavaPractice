import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PrizeDraw {

    /**
     * To participate in a prize draw each one gives his/her firstname.
     * Each letter of a firstname has a value which is its rank in the English alphabet.

     * A and a have rank 1, B and b rank 2 and so on.
     *
     * The length of the firstname is added to the sum of these ranks hence a number n.
     *
     * An array of random weights is linked to the firstnames and each n is multiplied by      *
     * its corresponding weight to get what they call a winning number.
     * <p>
     * Example: names: COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH weights: [1, 4, 4, 5, 2, 1]
     * <p>
     * PAUL -> n = length of firstname + 16 + 1 + 21 + 12 = 4 + 50 -> 54
     * The weight associated with PAUL is 2 so Paul's winning number is 54 * 2 = 108.
     * <p>
     * Now one can sort the firstnames in decreasing order of the winning numbers.
     * When two people have the same winning number sort them alphabetically by their firstnames.
     * <p>
     * #Task:
     * parameters:
     * st a string of firstnames,
     * we an array of weights,
     * n a rank
     * <p>
     * return: the firstname of the participant whose rank is n (ranks are numbered from 1)
     * <p>
     * #Example: names: COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH weights: [1, 4, 4, 5, 2, 1] n: 4
     * <p>
     * The function should return: PauL
     * <p>
     * Note:
     * If st is empty return "No participants".
     * If n is greater than the number of participants then return "Not enough participants".
     * See Examples Test Cases for more examples.
     */
    public static String nthRank(String st, Integer[] we, int n) {

        String[] arr = st.trim().split(",");
        Set<Long> weights = new HashSet<>();
        int weight = 0;
        int totalNameWeight = 0;
        HashMap result = new HashMap<String, Integer>();

        if (st.isEmpty()) {
            return "No participants";
        } else if (n > arr.length) {
            return "Not enough participants";
        }
        else {
            for (int i = 0; i < arr.length; i++){  // COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH
                for ( int j = 0; j < arr[i].length(); j++){
                    totalNameWeight = getWeightOfName(arr[i]);
               }
                weight = (arr[i].length() + totalNameWeight) * we[i];
                result.put(arr[i], weight);
            }

        }

        return "paul";
    }

    public static int getWeightOfName(String currentName){

        int temp_integer = 96;
        char[] ch = currentName.toLowerCase().toCharArray();
        int totalWeight = 0;

        for (char c : ch){
            int temp = (int) c;
            totalWeight += temp - temp_integer;
        }
        return totalWeight;
    }
}


