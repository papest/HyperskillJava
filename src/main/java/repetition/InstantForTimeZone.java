package repetition;

import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class InstantForTimeZone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        subtractFromEpoch(scanner.nextInt(), scanner.next());
    }

    public static void subtractFromEpoch(int days, String zone) {
        System.out.println(Instant.EPOCH.minus(days, ChronoUnit.DAYS).atZone(ZoneId.of(zone)));
    }
}
