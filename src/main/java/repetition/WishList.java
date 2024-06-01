package repetition;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class WishList {

    private final ArrayList<Integer> products;  // list of product_ids
    private final Semaphore semaphore = new Semaphore(1);
    private final Semaphore removeSemaphore = new Semaphore(0);

    public WishList() {
        this.products = new ArrayList<>();
    }

    public void addProduct(int id) {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        products.add(id);
        removeSemaphore.release();
        semaphore.release();
    }

    public void removeProduct(int id) {
        try {
            removeSemaphore.acquire();
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (products.contains(id)) {
            products.remove(Integer.valueOf(id));

        } else {
            removeSemaphore.release();
        }
        semaphore.release();
    }

    public int getSize() {
        return products.size();
    }
}
