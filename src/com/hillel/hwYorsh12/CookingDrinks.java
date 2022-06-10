package com.hillel.hwYorsh12;

public abstract class CookingDrinks {

    private int counter;
    private final char DOLLARS = '$';

    public CookingDrinks(int counter) {
        this.counter = counter;
    }

    protected abstract int priceAll();

    @Override
    public String toString() {
        return "You purchased: "+ getClass().getSimpleName() +" \nOne "+ getClass().getSimpleName() +
                " = " + priceAll() + DOLLARS +
                "\nQuantity = " + counter + " \nTotal cost = " + (priceAll() * counter) + DOLLARS;
    }
}
