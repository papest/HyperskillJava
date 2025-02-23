package chat;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("(\\w+) sent (.*)\n");
        scanner
                .findAll(pattern)
                .forEach(mr -> System.out.printf("%s: %s\n", mr.group(1), mr.group(2)));
    }
}
