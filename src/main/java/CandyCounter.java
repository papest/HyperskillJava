import java.util.Scanner;

public class CandyCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCandy = 0;
        int pieces;
        do {
            pieces = scanner.nextInt();
            totalCandy += pieces;
        } while (pieces != 0);

        System.out.printf("Total candy collected: %s\n", totalCandy);
        scanner.close();

    }
}
