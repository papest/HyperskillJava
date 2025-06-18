import java.util.Arrays;

class Multiplicator {
    public static <T extends Copy<T>> Folder<T>[] multiply(Folder<T> folder, int arraySize) {

        Folder<T>[] folders = new Folder[arraySize];
        T t = folder.get();
        for (int i = 0; i < arraySize; i++) {
            T newT = t.copy();
            folders[i] = new Folder<>();
            folders[i].put(newT);
        }
        return folders;
    }


    public static void main(String[] args) {
        Folder<CopyInteger> folder = new Folder<>();
        CopyInteger ci = new CopyInteger();
        ci.i = 5;
        folder.put(ci);
        System.out.println(Arrays.toString(multiply(folder, 3)));
    }
}

class CopyInteger implements Copy<CopyInteger> {
    int i;

    @Override
    public CopyInteger copy() {
        CopyInteger t = new CopyInteger();
        t.i = i;
        return t;
    }

    @Override
    public String toString() {
        return "" + i;
    }
}

interface Copy<T> {
    T copy();

}

class Folder<T> {
    @Override
    public String toString() {
        return super.toString() + "{" + item + "}";
    }

    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }
}

