import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

class CommonData {
    private StringBuilder data = new StringBuilder();

    public void loadData(String info) {
        data.append(info);
    }

    public String getData() {
        return data.toString();
    }
}

class DataLoader implements Runnable {
    private final CountDownLatch latch;
    private final CommonData data;

    DataLoader(CountDownLatch latch, CommonData data) {
        this.latch = latch;
        this.data = data;
    }

    @Override
    public void run() {
        synchronized (data) {
            data.loadData("ABA");
        }
        latch.countDown();
    }
}

public class NDataLoaders {
    public static void main(String[] args) throws InterruptedException {
        CommonData data = new CommonData();
        Scanner scanner = new Scanner(System.in);
        int countOfSources = scanner.nextInt();
        CountDownLatch latch = new CountDownLatch(countOfSources);
        for (int i = 0; i < countOfSources; i++) {
            new Thread(new DataLoader(latch, data)).start();
        }
        latch.await();
        System.out.println(data.getData());
    }
}