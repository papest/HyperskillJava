package repetition;

public class GenericClass {
    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        System.out.println(integerBox.get().toString());
    }
}

class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}