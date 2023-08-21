package repetition;

import java.time.LocalDateTime;
import java.util.Scanner;

public class LatestDate1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        System.out.println(scanner
                .tokens()
                .limit(count)
                .map(LocalDateTime::parse)
                .max(LocalDateTime::compareTo).get());

        scanner.close();
    }
}
