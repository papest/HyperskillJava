import java.util.function.*;

class FunctionUtils {

    public static Supplier<Integer> getInfiniteRange() {

        return new Supplier<>() {
            Integer x = 0;

            @Override
            public Integer get() {
                return x++;
            }
        };
    }


    public static void main(String[] args) {
        Supplier<Integer> sup1 = getInfiniteRange();
        Supplier<Integer> sup2 = getInfiniteRange();

        for (int i = 0; i < 5; i++) {
            System.out.print(sup1.get() + " " + sup2.get() + " ");

        }
    }
}