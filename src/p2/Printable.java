package p2;

public interface Printable {

    int OPEN = 1;
    int CLOSE = 0;


    default void print(){
        System.out.printf("Default print");
    }

    static void read(){
        System.out.println("Read");
    }

}
