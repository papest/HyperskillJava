import java.util.concurrent.atomic.AtomicReferenceArray;

class Queue {

    AtomicReferenceArray<Object> queue;

    public Queue(AtomicReferenceArray<Object> queue) {
        this.queue = queue;
    }

    public boolean enqueue(Object item) {
        int length = queue == null ? 0 : queue.length();
        for (int i = 0; i < length; i++) {
            if (queue.compareAndSet(i, null, item)) {
                return true;
            }
        }
        return false;
    }
}