import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
Friday 13th or Black Friday is considered as unlucky day. Calculate
how many unlucky days are in the given year.
Find the number of Friday 13th in the given year.
Input: Year as an integer.
Output: Number of Black Fridays in the year as an integer.
Examples:
unluckyDays(2015) == 3
unluckyDays(1986) == 1
 */
public class UnluckyDays {

    public static int unluckyDays(int year) throws ParseException {

        int month = 1;
        int day = 1;

        String dateString = "01/13/"+year;
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = dateFormat.parse(dateString);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        return 0;
    }
}
