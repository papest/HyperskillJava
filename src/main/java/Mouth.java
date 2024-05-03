import java.util.concurrent.*;

class Mouth {
    Semaphore semaphore1;
    Semaphore semaphore2;

    public Mouth() throws InterruptedException {
        semaphore1 = new Semaphore(1);
        semaphore2 = new Semaphore(1);
        semaphore1.acquire();
        semaphore2.acquire();
    }

    public void first() throws InterruptedException {
        System.out.print("I ");
        semaphore1.release();
    }

    public void second() throws InterruptedException {
        semaphore1.acquire();
        System.out.print("love ");
        semaphore2.release();
    }

    public void third() throws InterruptedException {
        semaphore2.acquire();
        System.out.print("programming!");
    }

    public static void main(String[] args) throws InterruptedException {
        Mouth mouth = new Mouth();
        Thread thread1 = new Thread(() -> {
            try {
                mouth.first();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                mouth.second();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread thread3 = new Thread(() -> {
            try {
                mouth.third();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread3.start();
        thread2.start();
        thread1.start();
        Thread.sleep(200);
    }
}
