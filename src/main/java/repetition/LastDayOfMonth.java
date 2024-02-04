package repetition;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.Scanner;

public class LastDayOfMonth {
    public static boolean isLastDayOfMonth(Year year, int dayOfYear) {
        LocalDate localDate = year.atDay(dayOfYear);
        return localDate.getDayOfMonth() == localDate.lengthOfMonth();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Year year = Year.of(scanner.nextInt());
        int dayOfYear = scanner.nextInt();
        scanner.close();
        System.out.println(isLastDayOfMonth(year, dayOfYear));
    }
}
