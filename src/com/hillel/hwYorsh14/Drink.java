package com.hillel.hwYorsh14;

public abstract class Drink implements DrinkMaker{

    private static int totalCount;
    private int quantity;
    private double price;


    public Drink(int quantity) {
        this.quantity = quantity;
    }

    public abstract double getPrice();

    public void increase(int count){
        totalCount +=count;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void make() {
        increase(getQuantity());
        String s = String.format(this + ": %s x %s = %.2f", quantity, getPrice(), order());
        System.out.println(s);
    }

    public double order() {
        return quantity * getPrice();
    }

    @Override
    public String toString() {
        return "Drink-" + getClass().getSimpleName();
    }
}
