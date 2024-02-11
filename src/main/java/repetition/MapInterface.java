package repetition;

import java.util.*;

class MapInterface {
    private static void log(Map<Long, String> map) {
        int size = map.size();
        System.out.println(
                switch (size) {
                    case 1 -> "Something in the map";
                    case 0 -> "There is no objects";
                    default -> "Too many objects";
                });
    }

    public static void main(String[] args) {
        String valueBase = "value-";
        Scanner scanner = new Scanner(System.in);

        Map<Long, String> m = new HashMap<>();
        long size = scanner.nextLong();
        for (long i = 0; i < size; ++i) {
            Long key = i;
            String value = valueBase + i;
            m.put(key, value);
        }
        log(Map.copyOf(m));
    }
}