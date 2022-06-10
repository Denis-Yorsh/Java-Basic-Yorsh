package com.hillel.hwYorsh12;

public class Coffee extends CookingDrinks{

    public Coffee(int counter) {
        super(counter);
    }

    @Override
    protected int priceAll() {
        return Drinks.getCOFFEE();
    }
}
