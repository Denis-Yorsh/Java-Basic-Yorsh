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
        CookingCocaCola cocaCola = new CookingCocaCola(intEnter);
        System.out.println(cocaCola);
    }

    private static void mineral(int intEnter) {
        CookingMineral mineral = new CookingMineral(intEnter);
        System.out.println(mineral);
    }

    private static void mahito(int intEnter) {
        CookingMahito mahito = new CookingMahito(intEnter);
        System.out.println(mahito);
    }

    private static void lemonade(int intEnter) {
        CookingLemonade lemonade = new CookingLemonade(intEnter);
        System.out.println(lemonade);
    }

    private static void tea(int intEnter) {
        CookingTea tea = new CookingTea(intEnter, 2);
        System.out.println(tea);
    }

    private static void coffee(int intEnter) {
        CookingCoffee coffee = new CookingCoffee(intEnter, 2);
        System.out.println(coffee);
    }
}
