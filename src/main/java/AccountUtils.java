import java.lang.reflect.Field;

final class AccountUtils {

    private AccountUtils() {
    }

    public static void increaseBalance(Account account, long amount) {
        try {
            Field balance = account.getClass().getDeclaredField("balance");
            balance.setAccessible(true);
            balance.set(account, (long) balance.get(account) + amount);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Account account = new Account(20);
        increaseBalance(account, 30);
        account.printBalance();
    }

}

class Account {
    private long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    public void printBalance() {
        System.out.println(balance);
    }

}

