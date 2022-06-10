package com.hillel.hwYorsh12;

public class Lemonade extends CookingDrinks{

    public Lemonade(int counter) {
        super(counter);
    }

    @Override
    protected int priceAll() {
        return Drinks.getCOCA_COLA();
    }
}
