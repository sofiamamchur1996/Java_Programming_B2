package day03_comments_escape_sequence;

public class Quote {

    public static void main (String [] args) {

        /*
            Q: How can I output the following

            I like "Java" programming

         */

        //                  I like "Java" programming
        System.out.println("I like \"Java\" programming");


        // Single quote is used as part of the Java Syntax as well.
                      System.out.println("I like 'Java' programing");


        // How can I print backward slash \
               System.out.println("I like \\Java\\ programing");


        // How can I print 2 backward slash?
        System.out.println("abc\\\\def");



    }

}
