public class InvokeStaticMethod {


        public static void main(String[] args) throws Exception {
            InvokeStaticMethod.class.getDeclaredMethod("hello").invoke(null);
        }

        static void hello() {
            System.out.println("Hello world!");
        }

    }