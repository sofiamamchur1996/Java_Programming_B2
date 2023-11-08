package day30_a_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwitchPairs {
    public static void main(String[] args) {

        ArrayList <String> words = new ArrayList<>(Arrays.asList( "Cat", "in",
                "the", "hat",
                "apple", "water")  );


        System.out.println("Original: " + words);
        for (int i = 0; i < words.size(); i+=2) {

            Collections.swap(words, i, (i + 1) );

            //TODO:  can you do this using a .set()
            // HINT: thing about swapping 2 int numbers

        }

        System.out.println("After Swap: " + words);

    }
}
