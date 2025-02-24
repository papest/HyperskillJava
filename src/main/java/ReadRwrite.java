import java.util.Scanner;

class ReadWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc
                .tokens()
                .forEach(System.out::println);

        sc.close();
    }
}