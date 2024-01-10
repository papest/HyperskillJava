import java.util.Arrays;
import java.util.Scanner;

public class CosmicSignal {
    public static String[] decipherCosmicSignal(String[] spaceSignalArray) {
        return Arrays.stream(spaceSignalArray).map(s -> s.replaceAll("~", "")).toArray(String[]::new);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] encryptedSpaceSignalArray = scanner.nextLine().split("\\s");
        String[] spaceSignalArray = decipherCosmicSignal(encryptedSpaceSignalArray);
        StringBuilder spaceMessage = new StringBuilder();
        for (String signal : spaceSignalArray) {
            spaceMessage.append(signal).append("\s");
        }
        System.out.println(spaceMessage.toString().trim());
    }
}