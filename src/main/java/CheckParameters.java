import java.util.Scanner;

public class CheckParameters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parameters = scanner.next().split("\\?")[1].split("&");
        String password = "";
        for (String param : parameters) {
            String[] arr = param.split("=");
            String name = arr[0];
            String value = arr.length > 1 ? arr[1] : "";
            System.out.printf("%s : %s\n", name, value.isBlank() ? "not found" : value);
            if ("pass".equals(name)) {
                password = value;
            }
        }
        if (!password.isBlank()) {
            System.out.printf("password : %s\n", password);
        }

    }
}