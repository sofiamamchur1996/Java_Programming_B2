package day30_a_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicatesNumbers {
    public static ArrayList<Integer> removeDuplicates (ArrayList <Integer> nums) {
        ArrayList <Integer> uniques = new ArrayList<>(nums);
        uniques.removeIf(  each ->  Collections.frequency(uniques, each) > 1 );
        return uniques;
    }

    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9 ));
        System.out.println("Original " + nums);
        System.out.println("Uniques: " + removeDuplicates(nums));
    }
}

