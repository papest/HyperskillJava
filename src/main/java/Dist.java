import java.util.Scanner;
import java.util.stream.IntStream;

class Dist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(IntStream
                .range(0, 3)
                .map(i -> scanner.nextInt())
                .distinct()
                .count() == 3);

        scanner.close();
    }
}
