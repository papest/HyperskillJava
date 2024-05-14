package repetition;

import java.util.concurrent.atomic.AtomicLong;

class BankAccount {
    private final AtomicLong balance;

    public BankAccount(long initialBalance) {
        balance = new AtomicLong(initialBalance);
    }

    public void deposit(long amount) {
        balance.addAndGet(amount);
    }

    public boolean withdraw(long amount) {
        long value = balance.get();
        if (value >= amount) {
            return balance.compareAndSet(value, value - amount);
        }
        return false;
    }

    public long getBalance() {
        return balance.get();
    }
}