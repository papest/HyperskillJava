import java.util.Scanner;

public class IntegerRangeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((b - a + 1) * (b + a) / 2);
    }
}
