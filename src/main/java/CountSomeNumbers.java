import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountSomeNumbers {
    public static void main(String[] args) {
        File file = new File("src/main/resources/dataset_91022.txt");
        try {
            Scanner scanner = new Scanner(file);
            long count = scanner
                    .tokens()
                    .mapToLong(Long::valueOf)
                    .filter(i -> i >= 9999L)
                    .count();
            System.out.println(count);
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
