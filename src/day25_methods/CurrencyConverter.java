package day25_methods;

public class CurrencyConverter {

    public static double convert (String currencyType, double amount) {

        switch (currencyType.toLowerCase()) {  //
            case "euro":
                return amount * 0.95;
            case "yen":
                return amount * 150.23;
            case "lira":
                return amount * 28.15;
            case "rupee":
                return amount * 83.17;
            default:
                return amount * 0;
        }
    }

    public static void main(String[] args) {

        System.out.println( convert( "Euro", 100.0) );
        System.out.println( convert( "LIRA", 100.0) );

        double convertedAmount = convert( "RUPEE", 100.0);
        System.out.println("With " + convertedAmount + " you can buy something. ");

    }


}
