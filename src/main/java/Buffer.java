import java.util.concurrent.Semaphore;

class Buffer {
    private char data;
    final Semaphore canPut = new Semaphore(1);
    final Semaphore canGet = new Semaphore(0);

    public void get() throws InterruptedException {
        canGet.acquire();
        System.out.println("Consumer consumed data : " + data);
        canPut.release();
    }

    public void put(char data) throws InterruptedException {
        canPut.acquire();
        this.data = data;
        System.out.println("Producer produced data : " + data);
        canGet.release();
    }

    public Thread threadGet() {
        return new Thread(() -> {
            try {
                this.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static void main(String[] args) throws InterruptedException {
        Buffer buffer = new Buffer();
        buffer.threadGet().start();
        buffer.threadGet().start();
        buffer.threadGet().start();

        for (int i : new int[]{1, 2, 3}) { buffer.put(String.valueOf(i).charAt(0));}
        Thread.sleep(200);
    }
}
