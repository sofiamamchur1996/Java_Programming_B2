package day30_a_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {
    public static ArrayList <String> removeLongString (ArrayList <String> list, int maxLength ) {

        ArrayList<String> updateList = new ArrayList<>(list);

        updateList.removeIf(  each -> (each.length() >  maxLength)  );

        return updateList;
    }


    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList( "one", "two", "three", "four", "five", "six"));
        System.out.println("Original: " + list);
        System.out.println( "After update: " +    removeLongString(list, 4)) ;

    }
}
