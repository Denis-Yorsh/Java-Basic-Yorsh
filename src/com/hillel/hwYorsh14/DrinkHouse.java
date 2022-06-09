package com.hillel.hwYorsh14;

import java.util.Arrays;
import java.util.Scanner;

public class DrinkHouse {
    public static final int EXIT = 2;
    private static Drink[] drinks = new Drink[0];

    public static void main(String[] args) {

        System.out.println(Arrays.toString(DrinkType.values()));
        int typeOfDrink;
        while (true){
            typeOfDrink = getInputIntDigitsUser("Choose your drink via digit");
            if (makeDrinks(typeOfDrink)) {
                break;
            }
        }
    }

    private static boolean makeDrinks(int typeOfDrink) {
        DrinkType drink = DrinkType.convert(typeOfDrink);
        if (drink != null) {
            int count = getInputIntDigitsUser("Enter count of drink");
            switch (drink) {
                case TEA:
                    int milk = getInputIntDigitsUser("Could you want to add milk(1-yes/2-no):");
                    Answer answer = Answer.convert(milk);
                    drinks = addToArray(drinks, new Tea(count, answer.toString()));
                    break;
                case COFFEE:
                    drinks = addToArray(drinks, new Coffee(count));
                    break;
                case COLA:
                    drinks = addToArray(drinks, new Cola(count));
                    break;
            }
            int yesOrNo = getInputIntDigitsUser("Do you have to add additional drink(1-yes/2-no)");
            if (yesOrNo == EXIT){
                createBill(drinks);
                return true;
            }
        }
        return false;
    }

    private static void createBill(Drink[] drinks) {
        double sum = 0;
        for (Drink drink : drinks) {
            drink.make();
            sum+=drink.order();
        }
        System.out.println("Your bill is");
        System.out.printf("Count of drinks: %d and total cost: %.2f", Drink.getTotalCount(), sum);
    }

    private static <T>T[] addToArray(T[] array, T element) {
        T[] copyOf = Arrays.copyOf(array, array.length + 1);
        copyOf[copyOf.length - 1] = element;
        return copyOf;
    }

    private static int getInputIntDigitsUser(String messageUser) {
        boolean inputDigits = false;
        int a = 0;
        while (!inputDigits) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(messageUser);

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
