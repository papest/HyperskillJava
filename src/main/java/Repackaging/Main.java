package Repackaging;



class Packer {
    public void repackage(Box<? super Bakery> to, Box<? extends Bakery> from) {
        to.put(from.get());
    }
}

// Don't change classes below
class Box<T> {
    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }
}

class Goods {
}

class Food extends Goods {
}

class Bakery extends Food {
}

class Cake extends Bakery {
}

class Pie extends Bakery {
}

class Tart extends Bakery {
}

class Main {
    public static void main(String[] args) {
        Packer packer = new Packer();
        Box<Cake> from = new Box<>();
        from.put(new Cake());
        Box<Bakery> to = new Box<>();

        packer.repackage(to, from);
        System.out.println(to.get());
        Box<Pie> from1 = new Box<>();
        from1.put(new Pie());
        packer.repackage(to, from1);
        System.out.println(to.get());

    }
}