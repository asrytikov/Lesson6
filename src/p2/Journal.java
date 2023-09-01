package p2;

public class Journal implements JournalPrintable, Searchable{

    private String name;

    public Journal(String name) {
        this.name = name;
    }

    public String getName() {
        int n = 1;
        if (n == OPEN) return name;
        else return "CLOSE";
    }

    @Override
    public int search() {
        return 0;
    }

    @Override
    public void paint() {
        System.out.println("Paint");
    }
}
