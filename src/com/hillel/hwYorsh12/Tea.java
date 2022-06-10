package com.hillel.hwYorsh12;

public class Tea extends CookingDrinks{

    public Tea(int counter) {
        super(counter);
    }

    @Override
    protected int priceAll() {
        return Drinks.getTEA();
    }
}
