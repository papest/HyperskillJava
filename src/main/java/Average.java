import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Average {

    /**
     * Returns the average value of numbers from a Set
     * that is accumulated from the input stream.
     *
     * @param numbers the input stream of Integer elements
     * @return average value of a Set of numbers
     */
    public static Double avgOnSet(Stream<Integer> numbers) {
        return numbers.distinct().collect(Collectors.averagingInt(a -> a));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stream<Integer> integerStream = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt);
        System.out.println(avgOnSet(integerStream));
    }
}