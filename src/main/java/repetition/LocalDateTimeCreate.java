package repetition;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeCreate {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(1993, 8, 30);
        LocalTime time = LocalTime.of(23, 45);
        LocalDateTime localDateTime = LocalDateTime.of(date, time);
        System.out.println(localDateTime);
        localDateTime = LocalDateTime.of(date, LocalTime.MIDNIGHT.minusMinutes(15));
        System.out.println(localDateTime);
        localDateTime = LocalDateTime.of(date, LocalTime.MIN.minusMinutes(15));
        System.out.println(localDateTime);
        localDateTime = LocalDateTime.parse("1993-08-30T23:45");
        System.out.println(localDateTime);
    }
}
