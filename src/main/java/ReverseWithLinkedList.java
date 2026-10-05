import java.util.*;

public class ReverseWithLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        LinkedList<String> list = new LinkedList<>(Arrays.asList(line.split(" ")));
        for (String curr = list.pollLast(); curr != null; curr = list.pollLast()) {
            System.out.printf("%s ", curr);
        }

    }
}