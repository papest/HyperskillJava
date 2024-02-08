package repetition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testPersonCreationValidArgs() {
        String name = "Jane Doe";
        int age = Person.MIN_AGE + 23;
        Person person = new Person(name, age);

        assertEquals(name, person.getName());
        assertEquals(age, person.getAge());
    }

    @Test
    void testPersonCreationNegativeAge() {
        String name = "Jane Doe";
        int age = Person.MIN_AGE - 1;
        Person person = new Person(name, age);

        assertEquals(Person.MIN_AGE, person.getAge());
    }

    @Test
    void testPersonCreationAgeOverUpperLimit() {
        String name = "Jane Doe";
        int age = Person.MAX_AGE + 1;
        Person person = new Person(name, age);

        assertEquals(Person.MAX_AGE, person.getAge());
    }

    @Test
    void testPersonCreationNameNull() {
        String name = null;
        int age = Person.MIN_AGE + 1;
        Person person = new Person(name, age);

        assertNotNull(person.getName());
        assertEquals(Person.DEFAULT_NAME, person.getName());
    }

    @Test
    void testPersonCreationNameBlank() {
        String name = "\t";
        int age = Person.MIN_AGE + 1;
        Person person = new Person(name, age);

        assertEquals(Person.DEFAULT_NAME, person.getName());
    }

    @Test
    void testPersonCreationNameEmpty() {
        String name = "";
        int age = Person.MIN_AGE + 1;
        Person person = new Person(name, age);

        assertEquals(Person.DEFAULT_NAME, person.getName());
    }

}