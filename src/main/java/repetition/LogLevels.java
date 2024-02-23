package repetition;

import java.util.Scanner;
import java.util.logging.Level;

public class LogLevels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner
                .tokens()
                .mapToInt(s -> Level.parse(s.toUpperCase()).intValue())
                .sum());
    }
}
