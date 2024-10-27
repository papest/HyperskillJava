package buzznumber;

import java.util.Scanner;

public class Main {
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
        System.out.println(even ? "This number is Even." : "This number is Odd.");
        System.out.printf("It is %sa Buzz number.\nExplanation:\n%s ", buzz ? "" : "not ", number);
        System.out.printf(!buzz ? "is neither divisible by 7 nor does it end with 7.\n" : divisible7 && end7 ?
                "is divisible by 7 and ends with 7." : divisible7 ? "is divisible by 7." : " ends with 7.");

    }
}
