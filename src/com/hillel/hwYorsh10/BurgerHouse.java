package com.hillel.hwYorsh10;

public class BurgerHouse {

    public static void main(String[] args) {

        extracted();
    }

    private static void extracted() {
        Burger burgerRegular = new Burger(1, 75, 50, 25, 35);
        Burger burgerWithoutMayonnaise = new Burger(1, 75, 50, 25);
        Burger burgerDoubleMeat = new Burger(1, 75, 75, 50, 25, 35);
    }
}
