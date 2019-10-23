import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverse3 {

    public static String[] reverse(String[] a) {

        String[] res = new String[a.length];
        StringBuilder build = new StringBuilder();

        for (int i = 0; i< a.length; i++) {
            build.append(a[i]);
        }

        String str = build.reverse().toString();
        int begin = 0;

        for (int i = 0; i < a.length; i++) {

            res[i] = str.substring(begin, begin + a[i].length());
            begin = begin + a[i].length();

        }

        return res;

    }
}
