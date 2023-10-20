package day28_arrayList;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(800);

        System.out.println(nums);
        System.out.println(nums.size());  // 5

        System.out.println( nums.isEmpty()  );

        nums.clear();
        System.out.println(nums);
        System.out.println(nums.size()); // 0
        System.out.println(nums.isEmpty()); // true

    }
}
