import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WithOddLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        System.out.println(Arrays
                .stream(line.split(" "))
                .filter(word -> word.length() % 2 != 0)
                .collect(Collectors.joining(" ")));
    }
}
