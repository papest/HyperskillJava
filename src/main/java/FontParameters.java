import java.util.EnumSet;
import java.util.Map;
import java.util.Scanner;

public class FontParameters {
    enum Fonts {
        BOLD, LARGE, MEDIUM, SMALL, ITALIC, NORMAL
    }

    EnumSet<Fonts> enumSet;

    public static void main(String[] args) {
        FontParameters object = new FontParameters();

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().trim().toLowerCase();
        Map<String, EnumSet<Fonts>> map = Map.of(
                "main-heading", EnumSet.of(Fonts.BOLD, Fonts.LARGE, Fonts.NORMAL),
                "quote", EnumSet.of(Fonts.SMALL, Fonts.ITALIC),
                "paragraph", EnumSet.of(Fonts.SMALL, Fonts.NORMAL),
                "sub-heading", EnumSet.of(Fonts.MEDIUM, Fonts.NORMAL),
                "quote|bold", EnumSet.of(Fonts.BOLD, Fonts.SMALL, Fonts.ITALIC)
        );
        if (map.containsKey(string)) {
            object.enumSet = map.get(string);
        } else {
            System.out.println("ERROR");
        }
        System.out.println(object.enumSet);
    }
}
