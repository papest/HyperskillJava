package repetition;

import java.util.concurrent.atomic.AtomicBoolean;

class Flag {
    public boolean setFlag(AtomicBoolean flag) {
        return !flag.compareAndExchange(false, true);
    }
}