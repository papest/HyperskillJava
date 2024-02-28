package repetition;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        List<String> list = scanner.tokens().collect(Collectors.toList());
        for (String s : list) {
            if (s.toUpperCase().equals(s)) {
                System.out.println("FINISHED");
                break;
            } else {
                System.out.println(s.toUpperCase());
            }
        }
    }
}