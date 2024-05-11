package repetition;

import java.util.concurrent.Semaphore;

class CO2 {
    Semaphore semO = new Semaphore(0);
    Semaphore semC = new Semaphore(2);

    public void carbon(StringBuffer molecules) throws InterruptedException {
        semC.acquire(2);
        molecules.append('C');
        semO.release(2);
    }

    public void oxygen(StringBuffer molecules) throws InterruptedException {
        semO.acquire();
        molecules.append('O');
        semC.release();
    }
}