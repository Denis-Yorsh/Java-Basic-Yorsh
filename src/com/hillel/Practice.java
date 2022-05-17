package com.hillel;

import java.util.Random;

public class Practice {

    public static void main(String[] args) {
        int randomNumber = 100;
        int[] array = new int[20];
        StringBuilder arrayNumber = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(randomNumber);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length - 1; i++) {
            arrayNumber.append(array[i]).append(".");
        }
        arrayNumber.append(array[array.length - 1]);
        System.out.print(arrayNumber);
    }
}
