import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class ListParameterInspector {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fieldName = scanner.next();

        ListParameterInspector inspector = new ListParameterInspector();
        inspector.printParameterType(new TestClass(), fieldName);
    }

    public void printParameterType(TestClass obj, String fieldName) throws Exception {
        Class clazz = obj.getClass();
        Field field = clazz.getDeclaredField(fieldName);
        ParameterizedType parameterizedType = (ParameterizedType) field.getGenericType();
        Type[] argumentTypes = parameterizedType.getActualTypeArguments();
        System.out.println(argumentTypes[0].getTypeName());
    }
}

class TestClass<T, V> {
    public List<String> listField;

    <K, V> void twoTypesMethod() {
    }

    <T> void singleTypeMethod() {
    }

    public Set<? extends String> stringMethod() {
        return new HashSet<>();
    }

}

