import java.util.*;
import java.util.stream.IntStream;

public class ReverseInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntStream
                .rangeClosed(1, 3)
                .boxed()
                .map(j -> Map.entry(j, sc.next()))
                .sorted(Comparator.comparingInt(Entry -> -Entry.getKey()))
                .map(Map.Entry::getValue)
                .forEach(System.out::println);

        sc.close();
    }
}