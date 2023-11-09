import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SampleClassTest {


    SampleClass instance = TestUtils.getSampleClassInstance();

    @BeforeAll
    static void beforeAll() {
    TestUtils.timeConsumingSetup();
    }

    @AfterAll
    static void afterAll() {

    }

    @BeforeEach
    void beforeEach() {

    }

    @AfterEach
    void afterEach() {

    }

    @Test
    void testMethodOne() {
        Assertions.assertTrue(instance.methodOne());
    }

    @Test
    void testMethodTwo() {
        Assertions.assertTrue(instance.methodTwo());
    }
}