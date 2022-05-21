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
        for (int i = 0; i < array.length; i++) {
            arrayNumber.append(array[i]).append(i == array.length - 1 ? "" : ".");
        }
        System.out.print(arrayNumber);
        System.out.println();

        System.out.println("-----------------------------------------------------------------");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
        System.out.println("-----------------------------------------------------------------");

        int[][] dimArray = {{5, 8, 3, 2, 6, 7}, {3, 8, 0, 1, 7, 9, 2}, {2, 1, 4}, {3, 5, 8, 0}};
        for (int i = 0; i < dimArray.length; i++) {
            for (int j = 0; j < dimArray[i].length; j++) {
                System.out.print(dimArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < dimArray.length; i++) {
            System.out.println(Arrays.toString(dimArray[i]));
        }
        System.out.println();
        int[][] arrayN = new int[3][3];
        for (int i = 0; i < arrayN.length; i++) {
            for (int j = 0; j < arrayN[i].length; j++) {
                if (i == j) {
                    arrayN[i][j] += 1;
                }
                System.out.print(arrayN[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] dimArra = {{5, 8, 3, 2, 6}, {3, 8, 0, 1, 7}};
        for (int i = 0; i < dimArra.length; i++) {
            for (int j = 0; j < dimArra[i].length; j++) {
                System.out.print(dimArra[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] dimArrayNew = new int[dimArra.length][dimArra[0].length];
        for (int i = 0; i < dimArra[0].length; i++) {
            for (int j = 0; j < dimArra.length; j++) {
                int value = dimArra[j][i];
                dimArrayNew[j][i] = value;
                System.out.print(dimArrayNew[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------");
    }
}
