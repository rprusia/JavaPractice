import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyLang {
    /**
     * Given a dictionary/hash/object of languages and your respective test results,
     * return the list of languages where your test score is at least 60,
     * in descending order of the results.
     *
     * Note: There will be no duplicate values.
     * Examples
     *
     * {"Java" => 10, "Ruby" => 80, "Python" => 65}  --> ["Ruby", "Python"]
     * {"Hindi" => 60, "Dutch" => 93, "Greek" => 71} --> ["Dutch", "Greek", "Hindi"]
     * {"C++" => 50, "ASM" => 10, "Haskell" => 20}   --> []
     */


        public static List<String> myLanguages(final Map<String, Integer> results) {

            return results.entrySet()
                    .stream()
                    .filter( me -> me.getValue() >= 60 )
                    .sorted( (m1,m2) -> Integer.compare(m2.getValue(),m1.getValue()) )
                    .map( me -> me.getKey() )
                    .collect(Collectors.toList());
        }
}

