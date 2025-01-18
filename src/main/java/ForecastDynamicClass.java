import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.implementation.MethodDelegation;

import java.lang.reflect.Method;

import static net.bytebuddy.matcher.ElementMatchers.named;
import static net.bytebuddy.matcher.ElementMatchers.takesArguments;

public class ForecastDynamicClass {
    public String dynamicClassPrintForecast() throws Exception {
        DynamicType.Unloaded<?> dynamicType = new ByteBuddy()
                .subclass(WeatherCondition.class)
                .method(named("printWeatherForecast").and(takesArguments(1)))
                .intercept(MethodDelegation.to(WeatherCondition.class))
                .make();

        Class<?> dynamicClass = dynamicType.load(ForecastDynamicClass.class.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER).getLoaded();
        Object instance = dynamicClass.getDeclaredConstructor().newInstance();

        Method m = dynamicClass.getMethod("printWeatherForecast", String.class);
        return m.invoke(instance, "rain").toString();
    }

    public static void main(String[] args) throws Exception {
        new ForecastDynamicClass().dynamicClassPrintForecast();
    }

}

