package day38_a_abstraction_interface.shopping;

public final class Amazon extends OnlineShopping {

    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon Cart");
    }

    @Override
    public void payForShipping(boolean b) {
        System.out.println(b ? "Paying for shipping" : "Free shipping");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Amazon");
    }
}