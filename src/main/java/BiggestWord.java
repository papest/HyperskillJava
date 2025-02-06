import java.util.*;

public class BiggestWord {

    public static void main(String[] args) {
        Triple<String, String, String> inputs = readInput();
        String message1 = inputs.first();
        String message2 = inputs.second();
        String message3 = inputs.third();

        ArrayList<String> list = new ArrayList<>(List.of(message1.split(" ")));
        Set<String> set2 = Set.of(message2.split(" "));
        Set<String> set3 = Set.of(message3.split(" "));
        list.retainAll(set2);
        list.retainAll(set3);
        String result = list.stream().max(Comparator.comparingInt(String::length)).orElse("");

        System.out.println(String.join("", "Самое длинное общее слово: ", result));
    }

    public static Triple<String, String, String> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] parts = input.split(" \\| ");
        return new Triple<>(parts[0], parts[1], parts[2]);
    }
}

record Triple<A, B, C>(A first, B second, C third) {
}