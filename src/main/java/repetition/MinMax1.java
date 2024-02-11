package repetition;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

class MinMax1 {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> minList = new ArrayList<>();

        T max = stream.sorted(order)
                .peek(i -> {
                    if (minList.isEmpty()) minList.add(i);
                })
                .max(order)
                .orElse(null);
        T min = minList.isEmpty() ? null : minList.get(0);

        minMaxConsumer.accept(min, max);
    }
}