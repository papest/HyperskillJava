import java.time.LocalDate;
import java.util.Scanner;

public class PreviousLocalDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
        int days = sc.nextInt();
        System.out.println(LocalDate.of(year, month + 1, 1).minusDays(days));
    }
}