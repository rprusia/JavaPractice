import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverse2 {

    public static String[] reverse(String[] a) {

        List<String> list = Arrays.asList(a);
        Collections.reverse(list);
        list.toArray(a);

        return a;

    }
}
