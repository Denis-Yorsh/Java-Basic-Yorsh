package com.hillel.hwYorsh12;

public class CookingLemonade {

    private static int counter;
    private final char DOLLARS = '$';

    public CookingLemonade(int counter) {
        CookingLemonade.counter = counter;
    }

    protected static int priceLemonade() {
        return Drinks.getLEMONADE() * counter;
    }

    @Override
    public String toString() {
        return "You purchased: Lemonade \nOne Lemonade = " + Drinks.getLEMONADE() + DOLLARS +
                "\nQuantity = " + counter + " \nTotal cost = " + priceLemonade() + DOLLARS;
    }
}
