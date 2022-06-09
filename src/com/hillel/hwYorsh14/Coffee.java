package com.hillel.hwYorsh14;

public class Coffee extends Drink {

    public Coffee(int quantity) {
        super(quantity);
    }

    @Override
    public double getPrice() {
        return PriceList.COFFEE;
    }
}
