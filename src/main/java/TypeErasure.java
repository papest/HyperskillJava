import java.util.ArrayList;
import java.util.List;

public class TypeErasure {
    public static void main(String[] args) {
        List<? extends Comparable<Double>> comparables = new ArrayList<>();
        System.out.println(comparables.getClass());
    }
}
