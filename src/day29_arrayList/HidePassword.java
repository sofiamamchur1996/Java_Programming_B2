package day29_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {

        ArrayList<String> password = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
        ArrayList <String> hidden = new ArrayList <>();

        for (int i = 0; i < password.size(); i++) {
            String result = "";
            for (int j = 0; j < password.get(i).length(); j++) {
                result += "*";
            }
            hidden.add(result);
        }
        System.out.println(password);
        System.out.println(hidden);


    }
}
