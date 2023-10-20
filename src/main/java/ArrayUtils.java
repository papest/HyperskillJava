import java.util.Arrays;
import java.util.Collections;

class ArrayUtils {
    public static <T> T[] invert(T[] array) {
        Collections.reverse(Arrays.asList(array));
        return array;
    }
}