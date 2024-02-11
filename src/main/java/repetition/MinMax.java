package repetition;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class MinMax {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        T min = null;
        T max = null;

        List<T> list = stream.sorted(order)
                .collect(Collectors.toList());

        if (!list.isEmpty()) {
            min = list.get(0);
            max = list.get(list.size() - 1);
        }

        minMaxConsumer.accept(min, max);
    }
}