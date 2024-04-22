package repetition;

import java.time.temporal.ChronoField;
import java.util.Scanner;
import java.time.Instant;

public class InstantToLong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(dateInEpochSecond(scanner.nextLine()));
    }

    public static long dateInEpochSecond(String text) {
        return Instant.parse(text).getLong(ChronoField.INSTANT_SECONDS);
    }
}
