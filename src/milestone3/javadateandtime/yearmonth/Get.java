package milestone3.javadateandtime.yearmonth;

import java.time.YearMonth;
import java.time.temporal.ChronoField;

public class Get {
    public static void main(String[] args) {
        YearMonth y = YearMonth.now();
        long l1 = y.get(ChronoField.YEAR);
        System.out.println(l1);
        long l2 = y.get(ChronoField.MONTH_OF_YEAR);
        System.out.println(l2);
    }
}
