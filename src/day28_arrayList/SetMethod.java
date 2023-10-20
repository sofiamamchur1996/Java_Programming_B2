package day28_arrayList;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(800);

        System.out.println( nums );
        nums.set(0, -900);
        System.out.println( nums );

        nums.set(2, 5000);
        System.out.println(nums);

        //nums.set( 10, 4000);  // Since the last index is 4, I do not have anything like index 10 - > So, it will give me IndexOutOfBoundsException
        //System.out.println(nums);

    }

}
