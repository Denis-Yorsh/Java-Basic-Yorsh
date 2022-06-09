package com.hillel.hwYorsh14;

public class Tea extends Drink{

    private String milk;

    public Tea(int quantity) {
        super(quantity);
    }

    public Tea(int quantity, String milk) {
        super(quantity);
        this.milk = milk;
    }

    @Override
    public double getPrice() {
        return PriceList.TEA;
    }

    @Override
    public String toString() {
        String withMilk = milk != null ? " with milk" + milk : "";
        return super.toString() + withMilk;
    }
}
