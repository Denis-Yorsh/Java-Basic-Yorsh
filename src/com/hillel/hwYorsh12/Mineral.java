package com.hillel.hwYorsh12;

public class Mineral extends CookingDrinks{

    public Mineral(int counter) {
        super(counter);
    }

    @Override
    protected int priceAll() {
        return Drinks.getMINERAL();
    }
}
