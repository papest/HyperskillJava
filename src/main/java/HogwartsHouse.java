import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HogwartsHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>() {
            {
                put("gryffindor", "bravery");

                put("hufflepuff", "loyalty");

                put("slytherin", "cunning");

                put("ravenclaw", "intellect");
            }

        };

        String house = scanner.next();
        System.out.println(map.getOrDefault(house, "not a valid house"));
    }
}