package repetition;

import java.util.*;

class MapFunctions {

    public static void calcTheSamePairs(Map<String, String> map1, Map<String, String> map2) {
        var set1 = map1.entrySet();
        set1.retainAll(map2.entrySet());
        System.out.println(set1.size());
    }

    static final int LONG_LENGTH = 7;

    public static void removeLongNames(Map<String, String> map) {
        map.entrySet()
                .removeIf(entry -> entry.getKey().length() > LONG_LENGTH || entry.getValue().length() > LONG_LENGTH);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] pair = s.split(" ");
            map.put(pair[0], pair[1]);
        }

        MapFunctions.removeLongNames(map);

        System.out.println(map.size());
    }

}
