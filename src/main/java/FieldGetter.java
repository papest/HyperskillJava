
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
}