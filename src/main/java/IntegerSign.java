import java.util.Scanner;

public class IntegerSign {
    public static int sign(int number) {
        return Integer.signum(number);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}
