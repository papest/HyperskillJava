import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveEvenAndReverse {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        try {
            list = Arrays.stream(new BufferedReader(new InputStreamReader(System.in)).readLine().split("\\s"))
                    .map(Integer::parseInt).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Integer> finalList = list;
        System.out.println(IntStream.range(0, list.size()).filter(i -> i % 2 != 0)
                .boxed().sorted(Comparator.reverseOrder())
                .map(finalList::get)
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}
