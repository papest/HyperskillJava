public class Max {

    void max(float x, float y) {
        if (x > y) System.out.println("X - is float");
        else System.out.println("Y - is float");
    }

    void max(Float x, Float y) {
        if (x > y) System.out.println("X - is Float");
        else System.out.println("Y - is Float");
    }

    void max(double x, double y) {
        if (x > y) System.out.println("X - is double");
        else System.out.println("Y - is double");
    }

    void max(Double x, Double y) {
        if (x > y) System.out.println("X - is Double");
        else System.out.println("Y - is Double");
    }

    void max(Integer x, Integer y) {
        if (x > y) System.out.println("X - is Double");
        else System.out.println("Y - is Double");
    }

    public static void main(String[] args) {
        Max max = new Max();
        max.max(1, 1);
        max.max(1.0f, 1.0f);
        max.max(Float.valueOf(1.0f), Float.valueOf(1.0f));
        max.max(1.0, 1.0);
        max.max(Double.valueOf(1.0), Double.valueOf(1.0D));
    }
}

