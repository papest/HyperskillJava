import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumAllNumbers {
    public static void main(String[] args) {
        File file = new File("src/main/resources/dataset_91033.txt");
        try {
            Scanner scanner = new Scanner(file);
            int sum = scanner
                    .tokens()
                    .mapToInt(Integer::valueOf)
                    .sum();
            System.out.println(sum);
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}