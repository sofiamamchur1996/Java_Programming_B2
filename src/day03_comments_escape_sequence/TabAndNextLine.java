package day03_comments_escape_sequence;

public class TabAndNextLine {

    public static void main(String[] args) {

        // The followings are about \t - tab
        System.out.println("This is not tabbed");
        System.out.println("\tThis is tabbed 1 time"); // this is tabbed 1 time
        System.out.println("    This is not tabbed");  // 4 space is equal 1 tab
        System.out.println("\t\tThis is tabbed 2 times");
        System.out.println();

        // The followings are about \n - new line
        System.out.println("1) Go to store");
        System.out.println("2) grab milk");
        System.out.println("3) pay cashier\n");


        System.out.println("1) Go to store\n2) grab milk\n3) pay cashier");

    }
    // MAC -- > option + command + L
    // Windows > ctrl + ALT + L
}
