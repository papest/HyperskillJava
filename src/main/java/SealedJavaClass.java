import java.util.Scanner;

public class SealedJavaClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%.2f", new Square(scanner.nextDouble()).getArea());
    }
}

sealed abstract class Shape permits Square {
    abstract double getArea();
}

non-sealed class Square extends Shape {
    private final double p0;
    public Square() {
        p0 = 0;
    }
    public Square(double x) {
        p0 = x;
    }


    @Override
    double getArea() {
        return p0 * p0;
    }
}


