package repetition;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class GoldMining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        BigDecimal dwalin = scanner.nextBigDecimal();
        BigDecimal balin = scanner.nextBigDecimal();
        BigDecimal thorin = scanner.nextBigDecimal();
        BigDecimal sum = dwalin.add(balin).add(thorin);
        System.out.println(sum);
    }
}
