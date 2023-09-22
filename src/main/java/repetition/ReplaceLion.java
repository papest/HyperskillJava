package repetition;


import java.util.Scanner;

public class ReplaceLion {
    private static String replace(String input) {
        return input.replaceAll("lion", "guinea pig");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(replace(line));
    }

}
