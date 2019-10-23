
public class HappyHolidays {

    public static String sort_gift_code(String giftCode) {

        String s = giftCode.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

        return s;
    }

}
