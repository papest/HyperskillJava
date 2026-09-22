package repetition;

import java.util.Scanner;
@SuppressWarnings("all")
class StringUtils {
    public static boolean isPalindrome(String str) {
        String string1 = str.toLowerCase().replaceAll(" ", "").replaceAll("'", "");
        return !string1.isEmpty() && string1.equals(new StringBuilder(string1).reverse().toString());
    }

    public static String concatStrings(String str1, String str2) {
        return (str1 == null ? "" : str1).concat(str2 == null ? "" : str2);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        str1 = "null".equalsIgnoreCase(str1) ? null : str1;
        str2 = "null".equalsIgnoreCase(str2) ? null : str2;

        System.out.println(concatStrings(str1, str2));
    }
}