package day39_a_polimorphism.book;

public class JavaTextBook extends EBook {

    boolean isFun;


    public void read () {
        System.out.println("Reading Java Text Book");
    }

    public void download(){
        System.out.println("Downloading Java Text Book");
    }

    public void open () {
        System.out.println("Opening Java Text Book");
    }
}
