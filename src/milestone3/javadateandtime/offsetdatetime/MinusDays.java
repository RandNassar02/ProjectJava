package milestone3.javadateandtime.offsetdatetime;

import java.time.OffsetDateTime;

public class MinusDays {
    public static void main(String[] args) {
        OffsetDateTime offset = OffsetDateTime.now();
        OffsetDateTime value =  offset.minusDays(240);
        System.out.println(value);
    }
}
