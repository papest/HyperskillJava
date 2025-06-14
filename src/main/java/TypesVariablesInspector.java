import java.lang.reflect.ParameterizedType;
import java.lang.reflect.WildcardType;

class TypeVariablesInspector {
    public void printTypeVariablesCount(TestClass obj, String methodName) throws NoSuchMethodException {
        Class clazz = obj.getClass();
        System.out.println(clazz.getDeclaredMethod(methodName).getTypeParameters().length);
    }

    public void printParameterType(TestClass obj, String methodName) throws Exception {
        ParameterizedType returnType = (ParameterizedType) obj.getClass().getDeclaredMethod(methodName).getGenericReturnType();
        System.out.println(((WildcardType) returnType.getActualTypeArguments()[0]).getUpperBounds()[0].getTypeName());
    }


    public static void main(String[] args) throws Exception {
        new TypeVariablesInspector().printTypeVariablesCount(new TestClass(), "twoTypesMethod");
        new TypeVariablesInspector().printParameterType(new TestClass(), "stringMethod");
    }

}



