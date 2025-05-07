
import java.util.Scanner;
import java.util.Arrays;

public class RightRotate {

    private static void rotate(int[] arr, int steps) {
        int right = steps % arr.length;
        int[] temp = new int[arr.length];
        System.arraycopy(arr, 0, temp, right, arr.length - right);
        System.arraycopy(arr, arr.length - right, temp, 0, right);
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}