import java.util.EnumSet;

public class EnumSetExamples {
    public static void main(String[] args) {
        EnumSet<TransactionExample.State> transactionSet = EnumSet.allOf(TransactionExample.State.class);
        System.out.println(transactionSet);
        transactionSet = EnumSet.of(TransactionExample.State.CANCELED);
        System.out.println(transactionSet);
        transactionSet = EnumSet.complementOf(transactionSet);
        System.out.println(transactionSet);
    }
}
