package p3;

public class Journal implements Printer.Printable{

    private String name;

    public Journal(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Print");
    }
}
