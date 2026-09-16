public class LetterPrinter {
    public void write(char letter) {
        System.out.print(letter);
        System.out.print(' ');
    }

    public void writeWords(String[] words)  {
        char[] letters = convert(words); // converting method
        for (char letter : letters) {
            write(letter);
        }
    }

    private char[] convert(String[] words) {
        return String.join("", words)
                .toCharArray();
    }

    public static void main(String[] args) {
        new LetterPrinter().writeWords(new String[]{"This", " ", "is", " ", "a", " ", "test"});
    }
}