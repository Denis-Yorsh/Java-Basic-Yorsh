package com.hillel.hwYorsh08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 9 separated by a space:");
        String enterString = enter.nextLine();

        int[] arrayEnter = arrayEnter(enterString);
        int number = arrayNumber(arrayEnter);
        int[] arrayRandom = arrayRandom(number);
        int numberOfCoincidences = numberOfCoincidences(arrayEnter, arrayRandom);

        System.out.println("Array Random: " + Arrays.toString(arrayRandom));
        System.out.println("Array Enter:  " + Arrays.toString(arrayEnter));
        System.out.println("Number of coincidences: " + numberOfCoincidences);
    }

    public static int[] arrayEnter(String enterString) {
        String[] array = enterString.split(" ");
        int[] intArray = new int[array.length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        return intArray;
    }

    public static int arrayNumber(int[] intRandom) {
        int number = 0;
        for (int i = 0; i < intRandom.length; i++) {
            number++;
        }
        return number;
    }

    public static int[] arrayRandom(int intRandom) {
        Random random = new Random();
        int[] intArray = new int[intRandom];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(10);
        }
        return intArray;
    }

    public static int numberOfCoincidences(int[] arrayEnter, int[] arrayRandom) {
        int number = 0;
        for (int i = 0; i < arrayEnter.length; i++) {
            if (arrayEnter[i] == arrayRandom[i]) {
                number++;
            }
        }
        return number;
    }
}
