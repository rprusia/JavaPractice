import java.util.*;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class WW {

    /**
     * My friend John and I are members of the "Fat to Fit Club (FFC)". John is worried because     *
     * each month a list with the weights of members is published and each month he is the last on the list which means he is the heaviest.
     * I am the one who establishes the list so I told him: "Don't worry any more, I will modify the order of the list".
     * It was decided to attribute a "weight" to numbers.
     *
     * The weight of a number will be from now on the sum of its digits.
     * For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99. Given a string
     * with the weights of FFC members in normal order can you give this string ordered by "weights" of these numbers?
     *
     * Example:
     * "56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes: "100 180 90 56 65 74 68 86 99"
     * When two numbers have the same "weight", let us class them as if they were strings and not numbers:
     * 100 is before 180 because its "weight" (1) is less than the one of 180 (9) and 180
     * is before 90 since, having the same "weight" (9) it comes before as a string.
     */
    public static String orderWeight(String strng) {

        String wwStr = "56 65 74 100 99 68 86 180 90";
        String[] items = wwStr.split(" "); // parse string.
        List<String> itemList = Arrays.asList(items);
        List<Integer> result = new ArrayList<Integer>();
        Map<String, Integer> unsortMap = new HashMap<String, Integer>();
        Integer currentTotal = 0;


        for ( int i = 0 ; i < itemList.size(); i++) {
            for ( int j = 0; j < itemList.get(i).length() ; j++)
            {
                currentTotal += Character.getNumericValue(itemList.get(i).charAt(j));

            }

            unsortMap.put(itemList.get(i),currentTotal);
            result.add(currentTotal);
            currentTotal = 0;
        }

        Map<String, Integer> sorted = unsortMap.entrySet().stream().sorted(comparingByValue()).collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,LinkedHashMap::new));

        return wwStr;
    }

}

