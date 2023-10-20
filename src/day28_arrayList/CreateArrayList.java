package day28_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {

        //ArrayList <String> listOne = new ArrayList<>(Arrays.asList("hello", "bye"));
        ArrayList <String> listOne = new ArrayList<>();
        listOne.add("hello");
        listOne.add("bye");
        System.out.println(listOne);

        ArrayList <String> listTwo = new ArrayList<>( listOne );  // adds the elements from the listOne ArrayList into the listTwo
        listTwo.add("Salam");

        System.out.println("--------");
        System.out.println(listOne);
        System.out.println(listTwo);

        ArrayList<String > listThree = new ArrayList<>( Arrays.asList("hello", "bye", "three"));
        System.out.println(listThree);

        // How can I get the last element dynamically from listThree?
        System.out.println( listThree.get(  listThree.size() - 1  ) );


        // Get the last element amd make all in UPPER case and adn re-assing back ot that index
        String newUpp = listThree.get(listThree.size() - 1).toUpperCase();
        listThree.set( listThree.size()-1,  newUpp  );
        System.out.println(listThree);


    }


}
