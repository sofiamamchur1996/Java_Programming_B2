package day28_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {
        // We made Integer array (not int array)
        // Array can work with PRIMITIVE and NON-PRIMITIVE data types
        Integer [] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));

        Arrays.asList(arr);

        ArrayList <Integer> nums = new ArrayList<>( Arrays.asList(arr)  );
        System.out.println( nums);

        ArrayList<Integer> nums2 = new ArrayList<>( Arrays.asList( 12, 23, 4, 5, 6  )  );
        System.out.println(nums2);

        ArrayList<Integer> nums3 = new ArrayList<>( Arrays.asList(100, 200, 300, 400, 800, 1000));
        // Instead of adding one by one, We can add all in declarion.
//        nums.add(100);
//        nums.add(200);
//        nums.add(300);
//        nums.add(400);
//        nums.add(800);
//        nums.add(100);

        nums3.add(4000);
        System.out.println(nums3);

    }

}
