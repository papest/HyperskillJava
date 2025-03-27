import java.util.Scanner;
import java.util.stream.IntStream;

public class TheMostTaxesCompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        Scanner incomesScanner = new Scanner(sc.nextLine());
        Scanner taxesScanner = new Scanner(sc.nextLine());
        int[] taxes = {0};
        int[] num = {0};

        IntStream.rangeClosed(1, count)
                .forEach(i -> {
                    int income = incomesScanner.nextInt();
                    int percentage = taxesScanner.nextInt();
                    if (income * percentage > taxes[0]) {
                        taxes[0] = income * percentage;
                        num[0] = i;
                    }
                });
        System.out.println(num[0]);
    }
}