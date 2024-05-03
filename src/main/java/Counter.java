import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    public int incrementCounter(AtomicInteger counter, int value, int max) {
        counter.set(Math.min(counter.get() + value, max));
        return counter.get();
    }
}