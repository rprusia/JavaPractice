import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverse {

    public static String[] reverse(String[] a) {

        int arrayLength = a.length;

        for (int i = 0; i < arrayLength / 2; i++) {

            String temp = a[i];
            a[i] = a[arrayLength - 1 - i];
            a[arrayLength - 1 - i] = temp;
        }

        return a;
    }
}
