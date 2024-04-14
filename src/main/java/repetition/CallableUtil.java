package repetition;

import java.util.Scanner;
import java.util.concurrent.Callable;

class CallableUtil {
    static Scanner scanner = new Scanner(System.in);

    public static Callable<String> getCallable() {
        return scanner::next;
    }
}