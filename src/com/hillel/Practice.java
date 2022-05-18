package com.hillel;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Practice {

    public static void main(String[] args) {
        int randomNumber = 100;
        Integer[] array = new Integer[20];
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
        System.out.println();

        System.out.println("-----------------------------------------------------------------");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
        System.out.println("-----------------------------------------------------------------");
    }
}
