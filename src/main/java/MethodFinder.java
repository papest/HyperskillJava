import java.lang.reflect.Method;
import java.util.Arrays;

class MethodFinder {

    public static String findMethod(String methodName, String[] classNames) {
        for (String className : classNames) {
            try {
                if (Arrays.stream(Class.forName(className).getMethods())
                        .map(Method::getName).anyMatch(name -> name.equals(methodName))) {
                    return className;
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}