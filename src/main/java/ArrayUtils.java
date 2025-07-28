import java.util.Arrays;
import java.util.Collections;

class ArrayUtils {
    public static <T> T[] invert(T[] array) {
        Collections.reverse(Arrays.asList(array));
        return array;
    }

    public static void printTheThirdRow(int[][] twoDimArray) {
        System.out.println(Arrays.toString(twoDimArray[2]).replaceAll("[,\\]\\[]", ""));
    }
}