package com.hillel.hwYorsh12;

public class Coca_Cola extends CookingDrinks {

    public Coca_Cola(int counter) {
        super(counter);
    }

    @Override
    protected int priceAll() {
        return Drinks.getCOCA_COLA();
    }
}
