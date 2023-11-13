import java.lang.reflect.InvocationTargetException;

class MethodsDemo {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        System.out.println(SomeClass.class.getMethods()[0].invoke(new SomeClass()));

    }
}

class SomeClass {

}