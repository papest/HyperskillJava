import java.util.Scanner;

class ProcessManager {
    private static String message;
    private static int errorCode;

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        message = scanner.nextLine();
        errorCode = Integer.parseInt(scanner.nextLine());

        startLongProcess(new Callback() {
            @Override
            public void onStarted() {
                System.out.println("The process started");
            }

            @Override
            public void onStopped(String cause) {
                System.out.println(cause);
            }

            @Override
            public void onFinished(int code) {
                System.out.println(code == 0 ? "The process successfully finished" :
                        String.format("The process is finished with error: %s", code));
            }
        });
    }

    public static void startLongProcess(Callback callback) {
        callback.onStarted();
        callback.onStopped(message);
        callback.onStarted();
        callback.onFinished(errorCode);
    }
}

interface Callback {

    void onStarted();

    void onStopped(String cause);

    void onFinished(int code);
}