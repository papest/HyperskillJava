import java.util.concurrent.*;

public class CompletableFutureAbout {
    public static CompletableFuture<String> getFutureObject() {
        CompletableFuture<String> hardExecutionFuture = new CompletableFuture<>();
        hardExecutionFuture.complete("Task is done");
        hardExecutionFuture.thenRun(CompletableFutureAbout::finishSomeHardWork);
        return hardExecutionFuture;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = getFutureObject();
        var value = future.getNow("default");
        var isDone = future.isDone();
        System.out.println("Is CompletableFuture done: " + isDone);
        System.out.println("Value from CompletableFuture: " + value);
    }

    public static void finishSomeHardWork() {
        try {
            int ONE_SECOND = 1000;
            Thread.sleep(ONE_SECOND);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
