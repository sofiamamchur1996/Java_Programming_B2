package day30_a_arrayList;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ted", "Talk", "Learn"));
        System.out.println(list);
        System.out.println(reversAll(list));
    }

    public static ArrayList<String> reversAll(ArrayList<String> list) {
        ArrayList<String> reversedList = new ArrayList<>();

        //"Ted", "Talk", "Learn"
        for (String each : list) {
//            String str = "";
//            for (int i = each.length()-1; i >= 0; i--) {  // Ted
//
//                str += each.charAt(i);   // d + e + T
//
//            }
//
//            reversedList.add(str);

            //String reversed = StringUtil.reverse(each);
            reversedList.add(StringUtil.reverse(each));
        }
        return reversedList;
    }
}
