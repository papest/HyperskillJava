import java.util.Map;
import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = Map.ofEntries(
                Map.entry("one", 1),
                Map.entry("two", 2),
                Map.entry("three", 3),
                Map.entry("four", 4),
                Map.entry("five", 5),
                Map.entry("six", 6),
                Map.entry("seven", 7),
                Map.entry("eight", 8),
                Map.entry("nine", 9)
        );
        System.out.println(map.get(sc.next()));

    }
}