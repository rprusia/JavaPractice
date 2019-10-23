import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class MyHashMapEx {

    public static void mapEx(){

        HashMap<String, Integer> hMap = new HashMap<String, Integer>();  // must be in method.
        hMap.put("Num1", 1);
        hMap.put("Num2", 2);
        hMap.put("Num3", 3);
        hMap.put("Num4", 4);

        // get all keys
        Set<String> keys = hMap.keySet();
        for(String i: keys) {
            System.out.println(hMap.get(i));
        }

        hMap.forEach((k,v) -> System.out.println("key:"  + k + " value:  " +v));


    }

}
