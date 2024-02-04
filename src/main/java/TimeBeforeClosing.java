import java.time.LocalTime;
import java.util.Scanner;
import java.util.stream.IntStream;

@SuppressWarnings("MagicNumber")
public class TimeBeforeClosing {

    private static class Pair {
        String story;
        LocalTime closingTime;

        Pair(String story, LocalTime time) {
            this.story = story;
            this.closingTime = time;
        }
    }

    static LocalTime nextTime(Scanner scanner) {
        return LocalTime.parse(scanner.next());
    }

    public static void main(String[] args) {
        LocalTime goOut = LocalTime.parse("19:30");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        IntStream.range(0, count)
                .mapToObj(i -> new Pair(scanner.next(), nextTime(scanner)))
                .filter(p -> goOut.plusMinutes(30).isBefore(p.closingTime))
                .map(p -> p.story)
                .forEach(System.out::println);
    }
}
