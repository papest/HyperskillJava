import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

class IntegralCalculator implements Runnable {
    private final double a, b;
    private final AtomicReference<Double> totalArea;
    private final CountDownLatch latch;

    public IntegralCalculator(double a, double b, AtomicReference<Double> totalArea, CountDownLatch latch) {
        this.a = a;
        this.b = b;
        this.totalArea = totalArea;
        this.latch = latch;
    }

    @Override
    public void run() {
        double width = b - a;
        // The height of the rectangle is the value of the function at the midpoint
        double height = (a + b) * (a + b) / 4.0;
        double area = width * height;

        totalArea.accumulateAndGet(area, Double::sum);
        latch.countDown();
    }
}

public class RectangleMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int n = scanner.nextInt();

        AtomicReference<Double> totalArea = new AtomicReference<>(0.0);
        CountDownLatch latch = new CountDownLatch(n);

        double width = (b - a) / n;
        for (int i = 0; i < n; i++) {
            double x1 = a + width * i;
            double x2 = x1 + width;
            new Thread(new IntegralCalculator(x1, x2, totalArea, latch)).start();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(totalArea.get());
    }
}