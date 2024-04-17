import java.util.Locale;
import java.util.Scanner;

record Player(String username, String email) {
    public String username() {
        return username.toUpperCase();
    }

    public String email() {
        return email.toLowerCase();
    }
}

record Home(String address, String city, String state, String zipCode) {
    Home(String address, String city, String state, String zipCode) {
        this.zipCode = zipCode == null ? "unknown" : zipCode;
        this.address = address.toUpperCase(Locale.ENGLISH);
        this.city = city.toUpperCase(Locale.ENGLISH);
        this.state = state.toUpperCase(Locale.ENGLISH);
    }
}

class Records {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(scanner.next(), scanner.next());
        scanner.nextLine();
        System.out.println(player.username() + ":" + player.email());

        Home home = new Home(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        System.out.println(home);
    }
}
