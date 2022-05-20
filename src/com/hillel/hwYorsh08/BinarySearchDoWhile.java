package com.hillel.hwYorsh08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearchDoWhile {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int binarySearch;

        System.out.println("Enter your number from 0 to 9:");

        do {
            int enterNumber = enter.nextInt();

            int[] arrayRandom = arrayRandom(10);
            System.out.println("Arrays Random is not sorted: " + Arrays.toString(arrayRandom));
            int firstElement = firstElement(arrayRandom);
            int lastElement = lastElement(arrayRandom);
            binarySearch = binarySearch(arrayRandom, enterNumber);

            System.out.println("Arrays Random sorted: " + Arrays.toString(arrayRandom));
            System.out.println("First Element: " + firstElement);
            System.out.println("Last Element: " + lastElement);
            if (binarySearch < 0) {
                System.out.println("Your number is not in the array, please enter another number from 0 to 9:");
            }
        } while (binarySearch < 0);

        System.out.println("Your numbers in the array under the index: " + binarySearch);
    }

    public static int[] arrayRandom(int intRandom) {
        Random random = new Random();
        int[] intArray = new int[intRandom];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(10);
        }
        return intArray;
    }

    public static int firstElement(int[] arrayRandom) {
        Arrays.sort(arrayRandom);
        int firstElement = arrayRandom[0];
        return firstElement;
    }

    public static int lastElement(int[] arrayRandom) {
        Arrays.sort(arrayRandom);
        int lastElement = arrayRandom[arrayRandom.length - 1];
        return lastElement;
    }

    public static int binarySearch(int[] arrayRandom, int enterNumber) {
        Arrays.sort(arrayRandom);
        int low = 0;
        int high = arrayRandom.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (enterNumber < arrayRandom[middle]) {
                high = middle - 1;
            } else if (enterNumber > arrayRandom[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
