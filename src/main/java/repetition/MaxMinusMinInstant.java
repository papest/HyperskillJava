package repetition;

import java.util.*;
import java.time.Instant;

public class MaxMinusMinInstant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Instant> instantList = createInstantList(scanner);

        long result = getMaxMinusMin(instantList);

        System.out.println(result);
    }

    public static List<Instant> createInstantList(Scanner scanner) {
        List<Instant> instantList = new ArrayList<>();
        instantList.add(Instant.parse(scanner.nextLine()));
        instantList.add(Instant.parse(scanner.nextLine()));
        instantList.add(Instant.parse(scanner.nextLine()));
        instantList.add(Instant.parse(scanner.nextLine()));

        return instantList;
    }

    private static long getMaxMinusMin(List<Instant> instantList) {
        if (instantList.isEmpty()) {
            return 0;
        }
        Instant max = instantList.get(0);
        Instant min = max;
        for (int i = 1; i < instantList.size(); i++) {
            Instant curr = instantList.get(i);
            if (curr.isBefore(min)) {
                min = curr;
                continue;
            }
            if (curr.isAfter(max)) {
                max = curr;
            }
        }
        return max.minusSeconds(min.getEpochSecond()).getEpochSecond();
    }
}