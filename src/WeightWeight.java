import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WeightWeight {

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

        Map<String, String> unsortMap = new HashMap<String, String>();
        String[] items = strng.split(" "); // parse string.
        List<String> itemList = Arrays.asList(items);
        List<Integer> result = new ArrayList<Integer>();
        StringBuilder newString = new StringBuilder(result.size());
        Integer currentTotal = 0;

       // int i = 0;
      //  for (String temp : itemList) {
        for ( int i = 0 ; i < itemList.size(); i++) {
          for ( int j = 0; j < itemList.get(i).length() ; j++)
            {
                currentTotal += Character.getNumericValue(itemList.get(i).charAt(j));

            }

            //unsortMap.put(temp, Integer.toString(currentTotal));
            unsortMap.put(itemList.get(i),Integer.toString(currentTotal));
            result.add(currentTotal);
            currentTotal = 0;
        }

        Map<String, String> sortedMap = sortByValue(unsortMap);

        for ( String value : sortedMap.keySet()){
            newString.append(value).append(" ");
        }
        return newString.toString().trim();
    }


    public static Integer[][] initializeArray(int size1, int size2)
    {
        Integer[][] temp = new Integer[size1][size2];

        for (int row = 0; row < 3; row ++)
            for (int col = 0; col < 3; col++)
                temp[row][col] = 0;

        return temp;
    }

    private static Map<String, String> sortByValue(Map<String, String> unsortMap) {

        Map<String, String> myList = new HashMap<String, String>();

       // TreeMap<String, String> sorted = new TreeMap<>()
        String[][] temp = new String[1][1];
        StringBuilder currentValue = new StringBuilder();




        return unsortMap;
    }


  /*  private static Map<String, String> sortByValue2(Map<String, String> unsortMap) {

        // 1. Convert Map to List of Map
      //  List<Map.Entry<String, String>> list =  new LinkedList<Map.Entry<String, String>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
       // Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<String, String> sortedMap = new LinkedHashMap<String, String>();
        for (Map.Entry<String, String> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        *//*
        //classic iterator example
        for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }*//*


        return sortedMap;
    }*/

}

