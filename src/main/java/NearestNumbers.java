import java.util.*;
import java.util.stream.Collectors;

public class NearestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        int number = scanner.nextInt();
        list.add(number);
        Integer[] array = list.stream().sorted().toArray(Integer[]::new);
        int index = Arrays.binarySearch(array, number);
        int minDistance1 = 0;
        int minDistance2 = 0;
        ArrayList<Integer> result1 = new ArrayList<>();
        ArrayList<Integer> result2 = new ArrayList<>();

        for (int i = index - 1; i >= 0; i--) {
            if (number - array[i] > minDistance1) {
                if (result1.isEmpty()) {
                    minDistance1 = number - array[i];
                } else {
                    break;
                }
            }
            result1.add(array[i]);
        }

        for (int i = index + 1; i < array.length; i++) {
            if (array[i] - number > minDistance2) {
                if (result2.isEmpty()) {
                    minDistance2 = array[i] - number;
                } else {
                    break;
                }
            }
            result2.add(array[i]);
        }

        ArrayList<Integer> result = new ArrayList<>();
        if (minDistance1 == minDistance2) {
            result.addAll(result1);
            result.addAll(result2);
        } else if (minDistance1 < minDistance2 && !result1.isEmpty() || result2.isEmpty()) {
            result = new ArrayList<>(result1);
        } else {
            result = new ArrayList<>(result2);
        }
        System.out.println(result.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}
