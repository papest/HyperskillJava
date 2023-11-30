package repetition;

class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return String.format("title=%s,yearOfPublishing=%s,authors=%s", title, yearOfPublishing,
                "[" + String.join(",", authors) + "]");
    }

    public static void main(String[] args) {
        System.out.println(new Book("Java 8 & 9 in Action", 2017, new String[]{"Mario Fusco", "Alan Mycroft"}));
    }
}