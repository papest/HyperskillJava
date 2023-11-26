import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.implementation.FixedValue;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class DynamicClass {
    public String dynamicClassToString() throws Exception {
        Class<?> dynamicClass = new ByteBuddy()
                .subclass(Object.class)
                .method(named("toString"))
                .intercept(FixedValue.value("Hello, ByteBuddy!"))
                .make()
                .load(DynamicClass.class.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                .getLoaded();
        Object instance = dynamicClass.getDeclaredConstructor().newInstance();
        return instance.toString();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new DynamicClass().dynamicClassToString());
    }
}