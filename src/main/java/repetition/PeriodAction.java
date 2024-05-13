package repetition;

import java.time.*;
import java.util.*;

public class PeriodAction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Period> periods = createPeriodList(scanner);

        Period result = getSumMinusMin(periods);

        System.out.println(result);
    }

    public static List<Period> createPeriodList(Scanner scanner) {
        List<Period> list = new ArrayList<>();
        list.add(Period.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        list.add(Period.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        list.add(Period.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        list.add(Period.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        list.add(Period.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));

        return list;
    }

    /**
     * Calculates days count in a Period unit.
     * Assumes there are no leap years and all months have 30 days
     */

    private static Period getSumMinusMin(List<Period> periods) {
        Comparator<Period> periodComparator = Comparator
                .comparing(Period::getYears)
                .thenComparing(Period::getMonths)
                .thenComparing(Period::getDays);
        Period min = periods.stream().min(periodComparator).orElse(Period.ZERO);
        return periods.stream().reduce(Period.ZERO, Period::plus).minus(min);
    }
}