class ThreadUtil {
    static void printNameOfTerminatedThread(Thread[] threads) {
        for (Thread thread : threads) {
            if (thread.getState().equals(Thread.State.TERMINATED)) {
                System.out.println(thread.getName());
                break;
            }
        }
    }

    static Thread createThreadInNewState() {
        return new Thread("This is new thread");
    }

    public static void main(String[] args) {
        Thread thread = ThreadUtil.createThreadInNewState();
        System.out.println(thread.getState());
    }
}
