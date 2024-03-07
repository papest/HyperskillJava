package repetition;

import java.util.LinkedList;
import java.util.Scanner;

public class ReverseOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> stack = new LinkedList<>();
        int count = n;
        while (count > 0) {
            stack.push(scanner.nextInt());
            count--;
        }
        while (n > 0) {
            System.out.println(stack.pollFirst());
            n--;
        }
    }
}
