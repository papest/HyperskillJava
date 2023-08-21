package repetition;

import java.time.LocalDateTime;
import java.util.Scanner;

public class LatestDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        LocalDateTime latest = LocalDateTime.parse(scanner.next());

        for (int i = 1; i < count; i++) {
            LocalDateTime current = LocalDateTime.parse(scanner.next());
            if (current.isAfter(latest)) {
                latest = current;
            }
        }
        scanner.close();
        System.out.println(latest);
    }
}
