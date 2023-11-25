package day39_a_polimorphism.covariant;

public class B extends A {

    //A method that returns A can be overridden as a method that return B since B is a A
    @Override
    public B test() {
        return new B();
    }


    @Override
    public void test2() {
        System.out.println("Overrided in child");
    }
}