import java.util.*;

import java.util.stream.Collectors;

public class InputWordsFrequency {
    public static final int LIMIT = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("[^A-Za-z0-9]+");
        Comparator<Map.Entry<String, Integer>> comp = (o1, o2) -> o2.getValue() - o1.getValue() == 0 ?
                o1.getKey().compareTo(o2.getKey()) :
                o2.getValue() - o1.getValue();
        Map<String, Integer> map;
        map = scanner
                .tokens()
                .map(String::toLowerCase)
                .collect(Collectors.toMap(a -> a, a -> 1, Integer::sum, TreeMap::new));

        map
                .entrySet()
                .stream()
                .sorted(comp)
                .limit(LIMIT)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
