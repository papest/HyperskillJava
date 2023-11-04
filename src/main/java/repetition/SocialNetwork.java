package repetition;

import java.util.Scanner;

class SocialNetwork {
    String name = "Social network";

    public void connect() {
        hello();
        post();
        logout();
    }

    public void hello() {
        System.out.printf("Log into %s\n", name);
    }

    public void post() {
        System.out.printf("Post: Hello, %s!\n", name);
    }

    public void logout() {
        System.out.printf("Log out of %s\n", name);
    }
}

class Instagram extends SocialNetwork {
    {
        name = "Instagram";
    }
}

class Facebook extends SocialNetwork {
    {
        name = "Facebook";
    }
}

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        scanner.close();
        SocialNetwork network = null;
        if ("facebook".equalsIgnoreCase(type)) {
            network = new Facebook();
        } else if ("instagram".equalsIgnoreCase(type)) {
            network = new Instagram();
        } else {
            System.out.println("Error!");
            System.exit(0);
        }
        network.connect();
    }
}