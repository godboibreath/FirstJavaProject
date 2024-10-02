package someSimpleTasks;

public class Book {
    private String name;
    private String author;

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String author) {
        this(name);
        this.author = author;
    }

    public void display() {
        System.out.println("Book name %s, book author %s".format(this.name, this.author));
    }

    public void display(String year) {
        System.out.println("Book name %s, book author %s, book year - %s".format(this.name, this.author, year));
    }
}
