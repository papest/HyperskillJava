package repetition;

class Person {

    public static final String DEFAULT_NAME = "Unknown";
    public static final int MAX_AGE = 130;
    public static final int MIN_AGE = 0;
    private final String name;
    private final int age;

    Person(String name, int age) {
        this.name = name == null || name.isEmpty() || name.isBlank() ? DEFAULT_NAME : name;
        this.age = age < MIN_AGE ? MIN_AGE : Math.min(age, MAX_AGE);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}