import java.lang.reflect.Modifier;
import java.util.Arrays;

class ReflectionUtils {

    public static long countPublicMethods(Class targetClass) {
        return Arrays.stream(targetClass.getDeclaredMethods())
                .filter(method -> Modifier.isPublic(method.getModifiers()))
                .count();
    }
}