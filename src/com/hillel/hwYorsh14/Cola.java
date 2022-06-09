package com.hillel.hwYorsh14;

public class Cola extends Drink{


    public Cola(int quantity) {
        super(quantity);
    }

    @Override
    public double getPrice() {
        return PriceList.COLA;
    }
}
