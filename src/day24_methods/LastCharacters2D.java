package day24_methods;

public class LastCharacters2D {
    public static void main(String[] args) {
        /*
    Imagine you have String 2D array which has size of 3 and each array has 3 elements
        these are the values:   apple, pear, bread
                                butter, water, juice
                                knofe, spoon, fork

        String [][] words = new String [3][3];
        String [][] words = {
                    { "apple", "pear", "bread"},
                    { "butter", "water", "juice"},
                    { "knife", "spoon", "fork"}
                };

        get the last character of each word and print them.
            first I need to loop through 2D array to get each array
                loop through each array to get each word
                    get the last character of each word


 */

        String [][] words = {
                {"Java", "is", "fun"},  // asn
                {"Softskills", "ehhh"}, //sh
                {"Loops", "are", "getting", "easier"}  //segr
        };



        //System.out.println(words.length); // 3
        //System.out.println(words[2].length); // 4
        for (int j = 0; j < words.length; j++) {


            for (int i = 0; i < words[j].length; i++) {
                String eachWord = words[j][i];
                System.out.print(eachWord.charAt(eachWord.length() - 1));

            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");

        //with FOREACH

        for ( String [] eachArr : words  ){

            for ( String eachElement : eachArr ){
                System.out.print(eachElement.charAt(eachElement.length() - 1));
            }
            System.out.println();

        }




    }
}
