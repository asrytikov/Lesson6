package p1;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java", "Shildt");
        book.print();

        Journal journal = new Journal("NatGeo");
        journal.print();

        Printable printable = new Book("Java2", "Shildt");
        printable.print();
        printable = new Journal("NatGeo");
        printable.print();
        String name = ((Journal)printable).getName();
        System.out.print(name);

    }
}

class Book implements Printable {

    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }
}

class Journal implements Printable {

    private String name;

    public Journal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {

    }
}