package day30_b_custom_classes;

public class Animal {
String species;
long population;

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", population=" + population +
                '}';
    }
}
