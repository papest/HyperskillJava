import java.util.Scanner;

public class PrintClassLoaderName {
    public static void main(String[] args) {
        System.out.println(PrintClassLoaderName.class.getClassLoader().getName());
        Scanner scanner = new Scanner(System.in);
        System.out.println(Scanner.class.getClassLoader());
    }
}
