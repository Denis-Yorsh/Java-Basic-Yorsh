package com.hillel.hwYorsh12;

public class Mahito extends CookingDrinks{

    public Mahito(int counter) {
        super(counter);
    }

    @Override
    protected int priceAll() {
        return Drinks.getMAHITO();
    }
}
