package com.hillel.hwYorsh12;

public class CookingCoffee {

    private static int coffee;
    private int sugar;
    private final char dollars = '$';

    public CookingCoffee(int coffee, int sugar) {
        CookingCoffee.coffee = coffee;
        this.sugar = sugar;
    }

    protected static int priceCoffee() {
        return Drinks.getCOFFEE() * coffee;
    }

    @Override
    public String toString() {
        return "You purchased: Coffee \nOne Coffee = " + Drinks.getCOFFEE() + dollars +
                "\nQuantity = " + coffee + " \nTotal cost = " + priceCoffee() + dollars;
    }
}
