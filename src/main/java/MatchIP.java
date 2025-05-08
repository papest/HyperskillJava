
import java.util.Scanner;

public class MatchIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next().matches("(((1?\\d{1,2})|(2[0-4]\\d)|(25[0-5]))\\.){3}((1?\\d{1,2})|(2[0-4]\\d)|(25[0-5]))") ? "YES" : "NO");
    }
}