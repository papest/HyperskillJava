import java.time.LocalDate;
import java.util.Scanner;

public class EveryNthDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate date = LocalDate.parse(sc.next());
        int year = date.getYear();
        int currYear = year;
        int offset = sc.nextInt();
        while (year == currYear) {
            System.out.println(date);
            date = date.plusDays(offset);
            year = date.getYear();
        }
    }
}
