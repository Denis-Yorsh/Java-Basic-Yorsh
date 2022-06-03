package com.hillel.hwYorsh12;

public class CookingTea {

    private static int tea;
    private int sugar;
    private final char dollars = '$';

    public CookingTea(int tea, int sugar) {
        CookingTea.tea = tea;
        this.sugar = sugar;
    }

    protected static int priceTea() {
        return Drinks.getTEA() * tea;
    }

    @Override
    public String toString() {
        return "You purchased: Tea \nOne Tea = " + Drinks.getTEA() + dollars +
                "\nQuantity = " + tea + " \nTotal cost = " + priceTea() + dollars;
    }
}
