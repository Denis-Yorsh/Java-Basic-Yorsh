package com.hillel.hwYorsh12;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        // beverage selection
        System.out.println("Choose a drink:\nCoffee, Tea, Mineral, Mahito, Lemonade or Coca_cola");
        String stringEnter = enter.nextLine().toUpperCase();
        // choice of drink amount
        System.out.println("Enter the amount of this drink");
        int intEnter = enter.nextInt();
        //send user data to the method cooking
        MethodsDrinksMachine.cooking(stringEnter, intEnter);
    }
}
