package com.hillel.hwYorsh12;

public class CookingCocaCola {

    private static int counter;
    private final char dollars = '$';

    public CookingCocaCola(int counter) {
        CookingCocaCola.counter = counter;
    }

    protected static int priceCocaCola() {
        return Drinks.getCOCA_COLA() * counter;
    }

    @Override
    public String toString() {
        return "You purchased: Coca Cola \nOne Coca Cola = " + Drinks.getCOCA_COLA() + dollars +
                "\nQuantity = " + counter + " \nTotal cost = " + priceCocaCola() + dollars;
    }
}
