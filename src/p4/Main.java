package p4;

public class Main {

    public static void main(String[] args) {
        Printable printable = createPrintable("NatGeo", false);
        printable.print();

        read(new Book("Java", "Horstmann"));
        read(new Journal("NatGeo"));
    }

    static void read(Printable printable){
        printable.print();
    }

    static Printable createPrintable(String name, boolean option){
        if (option){
            return new Book(name, "No author");
        }else{
            return new Journal(name);
        }
    }

}
