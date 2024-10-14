package repetition;

import java.util.Scanner;
import java.lang.ref.SoftReference;

public class SoftReferenceRepetition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num = scanner.nextInt();

        SoftReference<Integer> softReference1 = new SoftReference<>(num);

        num = 4;

        SoftReference<Integer> softReference2 = new SoftReference<>(num);

        num = null;

        System.out.println(softReference1.get());
        System.out.println(softReference2.get());
    }
}
