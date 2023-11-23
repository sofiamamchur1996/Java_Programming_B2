package day38_a_abstraction_interface.animal;

import day38_a_abstraction_interface.language.Language;

public class Parrot extends Bird implements Flyable, Language {
    public void eat(){
        System.out.println("Parrots each with their beaks");
    }

    public void fly() {
        System.out.println("Parrot is flying");
    }


    public void hi() {
        System.out.println("HI HI");
    }


    public void bye() {
        System.out.println("BYE BYE");
    }
}