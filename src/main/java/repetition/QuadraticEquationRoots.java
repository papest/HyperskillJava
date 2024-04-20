package repetition;

import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

public class QuadraticEquationRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double sq = Math.sqrt(b * b - 4 * a * c);
        TreeSet<Double> ts = new TreeSet<>();
        ts.add((-b - sq) / a / 2);
        ts.add((-b + sq) / a / 2);
        System.out.print(ts.pollFirst());
        if (!ts.isEmpty()) {
            System.out.printf(" %s", ts.pollFirst());
        }
        System.out.println();
    }
}
