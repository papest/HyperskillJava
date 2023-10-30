import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;

public class FirstAndLastMonthDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        LocalDate firstMonthDay = LocalDate.of(year, month, 1);
        LocalDate lastMonthDay = firstMonthDay.with(Month.of(month)).with(lastDayOfMonth());
        System.out.printf("%s %s", firstMonthDay, lastMonthDay);
    }
}
