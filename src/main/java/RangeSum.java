import java.util.Scanner;

public class RangeSum {

    public static long sumInRange(int from, int to) {
        return (long) (from + to) * (to - from + 1) / 2 - to;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));
    }
}