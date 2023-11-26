package repetition;

class StringUtils {
    public static boolean isPalindrome(String str) {
        String string1 = str.toLowerCase().replaceAll(" ", "").replaceAll("'", "");
        return !string1.isEmpty() && string1.equals(new StringBuilder(string1).reverse().toString());
    }
}