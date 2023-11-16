public class ClassOfClass {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(Class.forName(String.class.getClass().getName()));
    }
}
