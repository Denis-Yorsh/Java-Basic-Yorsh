package com.hillel.hwYorsh10;

public class Burger {

    private int bun;
    private int meat;
    private int cheese;
    private int greenery;
    private int mayonnaise;

    public Burger(int bun, int meat, int cheese, int greenery, int mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
        System.out.println("Burger regular: {" +
                "bun = " + bun + "ht" +
                ", meat = " + meat + "gr" +
                ", cheese = " + cheese + "gr" +
                ", greenery = " + greenery + "gr" +
                ", mayonnaise = " + mayonnaise + "mi" +
                '}');
    }

    public Burger(int bun, int meat, int cheese, int greenery) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        System.out.println("Burger without mayonnaise: {" +
                "bun = " + bun + "ht" +
                ", meat = " + meat + "gr" +
                ", cheese = " + cheese + "gr" +
                ", greenery = " + greenery + "gr" +
                '}');
    }

    public Burger(int bun, int meat, int twoMeat, int cheese, int greenery, int mayonnaise) {
        this.bun = bun;
        this.meat = meat + twoMeat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
        System.out.println("Burger double meat: {" +
                "bun = " + bun + "ht" +
                ", meat = " + this.meat + "gr" +
                ", cheese = " + cheese + "gr" +
                ", greenery = " + greenery + "gr" +
                ", mayonnaise = " + mayonnaise + "mi" +
                '}');
    }
}
