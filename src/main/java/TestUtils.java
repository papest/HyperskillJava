class SampleClass {

    public boolean methodOne() {
        return true;
    }

    public boolean methodTwo() {
        return true;
    }
}

class TestUtils {

    static SampleClass getSampleClassInstance() {
        return new SampleClass();
    }

    static void timeConsumingSetup() {

    }
}