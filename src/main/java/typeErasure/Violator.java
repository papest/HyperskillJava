package typeErasure;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("all")
class Violator {
    public static List<Box<? extends Bakery>> defraud() {
        List list = new ArrayList<Box<? extends Bakery>>();
        Box<Paper> box = new Box();
        box.put(new Paper());
        list.add(box);
        return list;
    }
}

/* This class and its subclasses should pass quality check */
class Bakery {}

class Cake extends Bakery {}

/* This one should not */
class Paper {}

/* These boxes are used to pack stuff */
class Box<T> {
    T t = null;
    void put(T item) {
        t = item;
    }
    T get() {
        return t;
    }
}

/* This quality checker ensures that boxes for sale contain Bakery and anything else */
class NaiveQualityControl {

    public static boolean check(List<Box<? extends Bakery>> boxes) {
    /* Method signature guarantees that all illegal
       calls will produce compile-time error... or not? */
        return true;
    }

}
