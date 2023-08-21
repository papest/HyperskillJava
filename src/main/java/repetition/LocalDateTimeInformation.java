package repetition;

import java.time.LocalDateTime;
import java.util.Scanner;

public class LocalDateTimeInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime localDateTime = LocalDateTime.parse(scanner.next());
        System.out.println(localDateTime.getHour() + (localDateTime.getDayOfYear() - 1) * 24);
    }
}
