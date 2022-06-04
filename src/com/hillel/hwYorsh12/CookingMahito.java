package com.hillel.hwYorsh12;

public class CookingMahito {

    private static int counter;
    private final char DOLLARS = '$';

    public CookingMahito(int counter) {
        CookingMahito.counter = counter;
    }

    protected static int priceMahito() {
        return Drinks.getMAHITO() * counter;
    }

    @Override
    public String toString() {
        return "You purchased: Mahito \nOne Mahito = " + Drinks.getMAHITO() + DOLLARS +
                "\nQuantity = " + counter + " \nTotal cost = " + priceMahito() + DOLLARS;
    }
}
