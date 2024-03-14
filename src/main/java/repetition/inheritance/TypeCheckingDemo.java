package repetition.inheritance;

import java.util.Scanner;

public class TypeCheckingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (Object msg : new Object[]{scanner.nextLine(), new Object()}) {
            if (msg instanceof String str && !str.isEmpty()) {
                System.out.println("The variable is not empty, the length is " + ((String) msg).length());
            }
        }
    }
}
