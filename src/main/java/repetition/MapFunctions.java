package repetition;

import java.util.*;

class MapFunctions {

    public static void calcTheSamePairs(Map<String, String> map1, Map<String, String> map2) {
        var set1 = map1.entrySet();
        set1.retainAll(map2.entrySet());
        System.out.println(set1.size());
    }
}
