public class ThreeMethodAnonymousClass {
    public static void main(String[] args) {

        ThreeMethodsInterface instance = new ThreeMethodsInterface() {
            private void print(String name) {
                System.out.printf("Implemented %s\n", name);
            }

            @Override
            public void do1() {
                print("do1");
            }

            @Override
            public void do2() {
                print("do2");

            }

            @Override
            public void do3() {
                print("do3");

            }
        };

        instance.do1();
        instance.do2();
        instance.do3();

    }

}

interface ThreeMethodsInterface {

    void do1();

    void do2();

    void do3();
}
