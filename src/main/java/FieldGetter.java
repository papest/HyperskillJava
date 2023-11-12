import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class FieldGetter {
    /**
     * Get number of fields class declares (the ones inherited should be excluded).
     */

    public int getNumberOfFieldsClassDeclares(Class<?> clazz) {
        return clazz.getDeclaredFields().length;
    }

    /**
     * Get number of accessible public fields for a given class.
     */

    public int getNumberOfAccessibleFields(Class<?> clazz) {
        return clazz.getFields().length;
    }

    /**
     * Get sorted list of private fields the object declares (inherited fields should be skipped).
     */

    public List<String> getPrivateFields(Object object) {
        return Arrays.stream(object.getClass().getDeclaredFields())
                .filter(a -> Modifier.isPrivate(a.getModifiers()))
                .map(Field::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    /**
     * Get list of public fields the object declares (inherited fields should be skipped).
     */

    public String[] getPublicFields(Object object) {
        return Arrays.stream(object.getClass().getDeclaredFields())
                .filter(a -> Modifier.isPublic(a.getModifiers()))
                .map(Field::getName)
                .collect(Collectors.toList())
                .toArray(new String[]{});
    }
}
