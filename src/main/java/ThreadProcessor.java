import java.util.Arrays;
import java.util.Optional;

class ThreadProcessor {
    public static void findAndStartThread(Thread... threads) throws InterruptedException {
        Optional<Thread> newThread = Arrays
                .stream(threads)
                .filter(thread -> thread.getState() == Thread.State.NEW)
                .findFirst();
        if (newThread.isPresent()) {
            Thread thread = newThread.get();
            thread.start();
            thread.join();
        }
    }
}