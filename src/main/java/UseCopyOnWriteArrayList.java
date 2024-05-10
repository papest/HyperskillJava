import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

class UseCopyOnWriteArrayList {

    public static void printElement(int n) throws InterruptedException {

        CopyOnWriteArrayList<Integer> onWriteArrayList = new CopyOnWriteArrayList<>();

        Thread writer1 = new Thread(() -> addNumbers(onWriteArrayList));
        Thread writer2 = new Thread(() -> removeNumbers(onWriteArrayList));

        writer1.start();
        writer2.start();

        writer1.join();
        writer2.join();

        System.out.println(onWriteArrayList.get(n));
    }


    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        UseCopyOnWriteArrayList.printElement(n);
    }

    public static void addNumbers(List<Integer> list) {
        for (int i = 0; i < 100001; i++) {
            list.add(i);
        }
    }

    public static void removeNumbers(List<Integer> list) {
        for (int i = 0; i < 50001; ) {
            if (!list.isEmpty()) {
                list.remove(0);
                i++;
            }
        }
    }
}