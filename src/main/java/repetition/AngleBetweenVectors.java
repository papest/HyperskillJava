package repetition;

import java.util.Scanner;

public class AngleBetweenVectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println(Math.toDegrees(Math.acos((x1 * x2 + y1 * y2) / Math.hypot(x1, y1) / Math.hypot(x2, y2))));
    }
}
