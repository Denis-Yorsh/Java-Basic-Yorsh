package com.hillel.hwYorsh07;

import java.util.Arrays;
import java.util.Scanner;

public class LengthArray {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int lengthArray = 0;

        do {
            System.out.println("Enter the length of the array from 5 to 25: ");
            lengthArray = enter.nextInt();
        } while (lengthArray < 5 || lengthArray > 25);

        int[] enterArray = lengthArray(lengthArray);
        System.out.println("An array of integers from -20 to 20:");
        System.out.println(Arrays.toString(enterArray) + "\n");

        int maxElement = maxElementArray(enterArray);
        System.out.println("Maximum array element: " + maxElement);

        int minElement = minElementArray(enterArray);
        System.out.println("Minimum array element: " + minElement);

        double middleElement = middleElementArray(enterArray);
        System.out.println("Middle element of the array: " + middleElement);
    }

    public static int[] lengthArray(int number) {
        int min = -20;
        int max = 20;
        int[] enterNumberArray = new int[number];

        for (int i = 0; i < enterNumberArray.length; i++) {
            enterNumberArray[i] = (int) (Math.random() * ((max - min) + 1) + min);
        }
        return enterNumberArray;
    }

    public static int maxElementArray(int[] array) {
        int maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    public static int minElementArray(int[] array) {
        int minElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        return minElement;
    }

    public static double middleElementArray(int[] array) {
        double middleElement = 0;
        for (int i = 0; i < array.length; i++) {
            middleElement += array[i];
        }
        return middleElement / array.length;
    }
}
