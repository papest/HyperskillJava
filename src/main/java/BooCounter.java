import java.util.Scanner;

@SuppressWarnings("all")
public class BooCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        int count = countBoos(input);
        System.out.println(count);
    }

    public static int countBoos(String str) {
        return (str.length() - str.toLowerCase().replaceAll("boo", "").length()) / 3;
    }
}

