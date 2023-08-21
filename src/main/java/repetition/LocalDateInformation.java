package repetition;

import java.time.LocalDate;
import java.util.Scanner;

public class LocalDateInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.parse(scanner.next());
        scanner.close();
        System.out.printf("%s %s%n", localDate.getDayOfYear(), localDate.getDayOfMonth());
    }
}
