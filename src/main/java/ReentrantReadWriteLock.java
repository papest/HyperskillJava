import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class ThreadSafeCache {

    private static int cache;
    private final java.util.concurrent.locks.ReentrantReadWriteLock lock;

    public ThreadSafeCache() {
        cache = 0;
        lock = new java.util.concurrent.locks.ReentrantReadWriteLock();
    }

    public int get() {
        lock.readLock().lock();
        int value = cache;
        lock.readLock().unlock();
        return value;
    }

    public void add() {
        lock.writeLock().lock();
        cache++;
        lock.writeLock().unlock();
    }
}

public class ReentrantReadWriteLock {
    private static final int COUNT_READ = 10;

    public static void main(String[] args) throws InterruptedException {
        ThreadSafeCache cache = new ThreadSafeCache();

        Scanner scanner = new Scanner(System.in);
        int countAdd = scanner.nextInt();

        Runnable writerTask = () -> {
            for (int i = 0; i < countAdd; i++) {
                cache.add();
            }
        };
        Runnable readerTask = () -> {
            for (int i = 0; i < COUNT_READ; i++) {
                cache.get();
            }
        };


        List<Thread> threads = Arrays.asList(new Thread(writerTask), new Thread(writerTask), new Thread(writerTask),
                new Thread(readerTask), new Thread(readerTask));


        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println(cache.get());
    }
}