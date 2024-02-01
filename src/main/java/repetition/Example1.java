package repetition;

import java.util.ArrayList;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }

        int n = scanner.nextInt();

        scanner.close();

        int sum = list
                .stream()
                .mapToInt(a -> a)
                .filter(i -> i > n)
                .sum();

        System.out.println(sum);
    }
}
