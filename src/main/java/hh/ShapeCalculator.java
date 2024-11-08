package hh;

class ShapeCalculator {

    public String calculate(String input) {

        String[] in = input.split(" ");
        double x = 1.0;
        if (in.length > 1) {
            x = Double.parseDouble(in[1]);
        }
        if (in[0].equals("круг")) {
            return String.format("%.2f %.2f", x * x * Math.PI, 2 * Math.PI * x);
        } else {
            return String.format("%.2f %.2f", x * x, 4 * x);
        }

    }

    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        System.out.println(calculator.calculate("круг 3"));
        System.out.println(calculator.calculate("квадрат"));
    }
}