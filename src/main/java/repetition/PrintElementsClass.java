package repetition;

import java.util.concurrent.CopyOnWriteArrayList;

class PrintElementsClass {

    public static void printElements(CopyOnWriteArrayList<String> onWriteArrayList, String elementToAdd) {
        onWriteArrayList.add(elementToAdd);
        System.out.println(String.join(" ", onWriteArrayList));
    }
}