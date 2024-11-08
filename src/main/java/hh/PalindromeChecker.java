package hh;

class PalindromeChecker {

    public String checkPalindrome(String input) {
        String lowInput = input.toLowerCase();
        return !input.isEmpty() && new StringBuilder(lowInput)
                .reverse()
                .toString()
                .contentEquals(lowInput) ? "Палиндром" : "Не палиндром";
    }

    public static void main(String[] args) {
        System.out.println(new PalindromeChecker().checkPalindrome("AaO"));
    }
}
