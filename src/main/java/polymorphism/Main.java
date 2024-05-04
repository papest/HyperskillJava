package polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruitType = in.nextLine();
        System.out.println("Apple".equals(fruitType) ? new Apple().taste() : new Orange().taste());
    }
}
