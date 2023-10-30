import java.time.LocalDate;
import java.util.Scanner;

public class NewYearComing {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.parse(scanner.next());
        int days = scanner.nextInt();
        System.out.println(localDate.plusDays(days).getYear() > localDate.getYear());
    }
}
