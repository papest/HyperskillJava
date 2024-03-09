import java.util.Arrays;
import java.util.Scanner;

public class ArrayCalc {

    // static nested class
    public static class MinMaxPair {
        private int min;
        private int max;

        public MinMaxPair(int first, int second) {
            this.min = first;
            this.max = second;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }
    }

    public static MinMaxPair findMinMax(int[] array) {
        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        return new MinMaxPair(sortedArray[0], sortedArray[array.length - 1]);
    }

    public static void printStatistic(int[] array) {
        var stat = Arrays.stream(array).summaryStatistics();
        System.out.println(stat);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input array
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        ArrayCalc.MinMaxPair p = ArrayCalc.findMinMax(array);

        System.out.println("min = " + p.getMin());
        System.out.println("max = " + p.getMax());
        ArrayCalc.printStatistic(array);
    }
}