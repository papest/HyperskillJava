package repetition;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Durations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Duration> durations = createDurationList(scanner);

        Duration result = getMaxMinusAvg(durations);

        System.out.println(result);
    }

    public static List<Duration> createDurationList(Scanner scanner) {
        List<Duration> list = new ArrayList<>();
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.DAYS));
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.HOURS));
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.MINUTES));
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.MINUTES));
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.SECONDS));
        return list;
    }

    public static Duration getMaxMinusAvg(List<Duration> durations) {
        return Collections.max(durations)
                .minus(durations
                        .stream()
                        .reduce(Duration.ZERO, Duration::plus)
                        .dividedBy(durations.size()));
    }
}