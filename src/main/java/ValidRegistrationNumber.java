import java.util.Scanner;

public class ValidRegistrationNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regNum = scanner.nextLine();
        System.out.println(regNum.matches("[ABEKMHOPCTYX][0-9]{3}[ABEKMHOPCTYX]{2}"));
    }
}