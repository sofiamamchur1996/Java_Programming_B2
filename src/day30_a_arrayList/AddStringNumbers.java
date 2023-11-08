package day30_a_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumbers {



    // IMPLEMENTATION: function of the method body.
    public static ArrayList<Integer> sumFromString (ArrayList <String> list ) { //"123", "34", "513"
        ArrayList <Integer> numSum = new ArrayList<>();

        for( String each : list) { //"123" | "34" | "513"

            int sum = 0;

            for (int i = 0; i < each.length(); i++) { //"123"
                sum +=  Integer.parseInt( "" +  each.charAt(i)); // from String to Integer - 1+2+3 = 6  | Unboxing auto type promotion happens
            }
//            This is doing the same thing as above inner loop.
//            int sum2 = 0;
//            for (  String eachDigit : each.split("")){
//                sum2 +=  Integer.parseInt( eachDigit);
//            }
            numSum.add( sum );
        }
        return numSum;
    }

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("123", "34", "513" ));
        System.out.println(  sumFromString(list) );
    }
}
