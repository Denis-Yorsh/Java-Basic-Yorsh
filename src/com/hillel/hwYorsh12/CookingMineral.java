package com.hillel.hwYorsh12;

public class CookingMineral {

    private static int counter;
    private final char DOLLARS = '$';

    public CookingMineral(int counter) {
        CookingMineral.counter = counter;
    }

    protected static int priceMineral() {
        return Drinks.getMINERAL() * counter;
    }

    @Override
    public String toString() {
        return "You purchased: Mineral \nOne Mineral = " + Drinks.getMINERAL() + DOLLARS +
                "\nQuantity = " + counter + " \nTotal cost = " + priceMineral() + DOLLARS;
    }
}
