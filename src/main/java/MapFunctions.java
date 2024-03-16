import java.util.*;


class MapFunctions {
    public static void printWithSameLetter(Map<String, String> map) {
        map.forEach((key, value) -> {
            if (key != null && value != null && key.substring(0, 1).equalsIgnoreCase(value.substring(0, 1))) {
                System.out.printf("%s %s\n", key, value);
            }
        });
    }



    public static void putThreeCountries(Map<String, String> map) {
        map.put("Russia", "Moscow");
        map.put("USA", "Washington");
        map.put("Tanzania", "Dodoma");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] pair = s.split(" ");
            map.put(pair[0], pair[1]);
        }

        putThreeCountries(map);
        System.out.println(map.size());
        printWithSameLetter(map);
    }
}