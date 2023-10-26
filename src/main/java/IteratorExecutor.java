class IteratorExecutor {

    static void performIterationsWithCallback(int numberOfIterations, LoopCallback callback) {
        for (int i = 0; i < numberOfIterations; i++) {
            callback.onNewIteration(i);
        }
    }

    static void startIterations(int numberOfIterations) {
        performIterationsWithCallback(numberOfIterations, new LoopCallback() {
            @Override
            public void onNewIteration(int iteration) {
                System.out.printf("Iteration: %s\n", iteration);
            }
        });
    }

    public static void main(String[] args) {
        startIterations(10);
    }
}

interface LoopCallback {

    void onNewIteration(int iteration);
}

