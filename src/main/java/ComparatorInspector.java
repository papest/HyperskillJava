import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/**
 * Class to work with
 */
class ComparatorInspector {

    /**
     * Return Type variable that corresponds to the type parameterizing Comparator.
     *
     * @param clazz {@link Class} object, should be non null
     * @return {@link Type} object or null if Comparable does not have type parameter
     */
    public static <T extends Comparable<?>> Type getComparatorType(Class<T> clazz) {
        return Arrays
                .stream(clazz.getGenericInterfaces())
                .filter(i -> i.getTypeName().startsWith("java.lang.Comparable"))
                .map(f ->
                        ((ParameterizedType) f).getActualTypeArguments()[0])
                .findFirst().get();
    }

    public static void main(String[] args) {
        System.out.println(new OneClass().compareTo("b"));
        System.out.println(getComparatorType(OneClass.class).getTypeName());
    }
}

class OneClass implements Comparable<String> {
    String c = "c";

    @Override
    public int compareTo(String o) {
        return c.compareTo(o);
    }
}
