package repetition;

import java.util.List;

public class SameNumberOfTimes {
    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        return list1.stream().filter(i -> i == elem).count() == list2.stream().filter(i -> i == elem).count();
    }
}