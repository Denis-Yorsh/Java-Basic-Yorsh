package com.hillel.hwYorsh12;

public class MethodsDrinksMachine {

    protected static void cooking(String stringEnter, int intEnter) {
        //iterates over the name of the drink
        DrinksMachine choice = DrinksMachine.valueOf(stringEnter);
        switch (choice) {
            case COFFEE:
                coffee(intEnter);
                break;
            case TEA:
                tea(intEnter);
                break;
            case LEMONADE:
                lemonade(intEnter);
                break;
            case MAHITO:
                mahito(intEnter);
                break;
            case MINERAL:
                mineral(intEnter);
                break;
            case COCA_COLA:
                cocaCola(intEnter);
                break;
        }
    }

    private static void cocaCola(int intEnter) {
        Coca_Cola cocaCola = new Coca_Cola(intEnter);
        System.out.println(cocaCola);
    }

    private static void mineral(int intEnter) {
        Mineral mineral = new Mineral(intEnter);
        System.out.println(mineral);
    }

    private static void mahito(int intEnter) {
        Mahito mahito = new Mahito(intEnter);
        System.out.println(mahito);
    }

    private static void lemonade(int intEnter) {
        Lemonade lemonade = new Lemonade(intEnter);
        System.out.println(lemonade);
    }

    private static void tea(int intEnter) {
        Tea tea = new Tea(intEnter);
        System.out.println(tea);
    }

    private static void coffee(int intEnter) {
        Coffee coffee = new Coffee(intEnter);
        System.out.println(coffee);
    }
}
