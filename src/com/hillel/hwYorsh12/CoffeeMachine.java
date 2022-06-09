package com.hillel.hwYorsh12;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        for (;;) {
            // beverage selection
            String stringEnter = getInputIntDigitsUserString
                    ("Choose a drink:\nCoffee, Tea, Mineral, Mahito, Lemonade or Coca_cola");
            // choice of drink amount
            int intEnter = getInputIntDigitsUserInt("Enter the amount of this drink");
            //send user data to the method cooking
            MethodsDrinksMachine.cooking(stringEnter, intEnter);
        }
    }

    private static String getInputIntDigitsUserString(String messageUser) {
        boolean inputDigits = false;
        String a = "";
        while (!inputDigits) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(messageUser);

            if (scanner.hasNextLine()) {
                a = scanner.nextLine().toUpperCase();
                inputDigits = true;

            } else {
                System.out.println("Try again");
            }
        }
        return a;
    }

    private static int getInputIntDigitsUserInt(String messageUser) {
        boolean inputDigits = false;
        int a = 0;
        while (!inputDigits) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(messageUser);

            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                inputDigits = true;

            } else {
                System.out.println("Try again");
            }
        }
        return a;
    }
}
