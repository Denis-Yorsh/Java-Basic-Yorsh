package com.hillel.hwYorsh12;

public class CookingMineral {

    private static int counter;
    private final char dollars = '$';

    public CookingMineral(int counter) {
        CookingMineral.counter = counter;
    }

    protected static int priceMineral() {
        return Drinks.getMINERAL() * counter;
    }

    @Override
    public String toString() {
        return "You purchased: Mineral \nOne Mineral = " + Drinks.getMINERAL() + dollars +
                "\nQuantity = " + counter + " \nTotal cost = " + priceMineral() + dollars;
    }
}
