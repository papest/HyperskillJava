import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal first = new BigDecimal(scanner.next());
        BigDecimal second = new BigDecimal(scanner.next());
        System.out.println(first.multiply(second));
    }
}
