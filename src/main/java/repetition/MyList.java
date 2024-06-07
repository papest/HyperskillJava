package repetition;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

class MyList {
    public void removeDuplicates(AtomicReference<List<Integer>> list) {
        list.setRelease(new HashSet<>(list.getAcquire()).stream().toList());
    }

    public static void main(String[] args) {
        AtomicReference<List<Integer>> list = new AtomicReference<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        new MyList().removeDuplicates(list);
        System.out.println(list);
    }
}