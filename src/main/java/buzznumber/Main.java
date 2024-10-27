package buzznumber;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void printProperty(LinkedHashMap<String, Boolean> property) {

        property
                .entrySet()
                .stream()
                .map(entry -> String.format("%s : %s", entry.getKey(), entry.getValue()))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.println("This number is not natural!");
            return;
        }
        boolean even = number % 2 == 0;
        boolean end7 = number % 10 == 7;
        boolean divisible7 = number % 7 == 0;
        boolean buzz = end7 || divisible7;
        boolean duck = String.valueOf(number).contains("0");
        System.out.printf("Property of %s\n", number);
        printProperty(new LinkedHashMap<>(1, 5, true) {{
            put("even", even);
            put("odd", !even);
            put("buzz", buzz);
            put("duck", duck);
        }});
    }
}
