import java.util.Arrays;
import java.util.List;

public class Sid {

    static String howMuchILoveYou(int nb_petals) {

        return Arrays
                .asList("not at all",
                        "I love you",
                        "a little",
                        "a lot",
                        "passionately",
                        "madly")
                .get(nb_petals % 6);
    }
}
