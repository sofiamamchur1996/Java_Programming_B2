package day38_a_abstraction_interface.language;

public class Translator {
    public static void main(String[] args) {
        // Language obj = new Language();
        // Cannot create object of INTERFACE

        Spanish obj2 = new Spanish();
        obj2.hi();
        obj2.bye();



        Azer obj3 = new Azer();
        obj3.hi();
        obj3.bye();


        System.out.println(Language.PLANET);
    }
}

