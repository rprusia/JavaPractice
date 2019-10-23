import java.util.Arrays;
import java.util.List;

public class Bingo {

    public static String bingo(int[] numberArray) {

        Integer[] bingo = {2, 9, 14, 7, 15};
        boolean b = false, i = false, n = false, g = false, o = false;
        List<Integer> list = Arrays.asList(bingo);
        StringBuilder result = new StringBuilder();

        for (int x : numberArray) {
            if (list.contains(x)) {
                if (x == 2)
                    b = true;
                else if (x == 9)
                    i = true;
                else if (x == 14)
                    n = true;
                else if (x == 7)
                    g = true;
                else if (x == 15)
                    o = true;
            }
        }

        if (b && i && n && g && o)
            result.append("WIN").toString();
        else {
            result.append("LOSE").toString();
        }
        return result.toString();

    }
}