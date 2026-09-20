package area;

import static java.lang.Math.PI;

class Circle implements Measurable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * PI;
    }
}

interface Measurable {
    double area();
}