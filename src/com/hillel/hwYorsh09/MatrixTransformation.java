package com.hillel.hwYorsh09;

import java.util.Scanner;

public class MatrixTransformation {

    public static void main(String[] args) {
        int[][] arrayEnter = getInts();
        extracted(arrayEnter);
        extractedTransformation(arrayEnter);
    }

    private static int[][] getInts() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter yor number:");
        int enterYourNumber = enter.nextInt();
        return new int[enterYourNumber][2];
    }

    private static void extractedTransformation(int[][] arrayEnter) {
        int[][] arrayTransformation = new int[arrayEnter.length][arrayEnter[0].length];
        for (int i = 0; i < arrayEnter[0].length; i++) {
            for (int j = 0; j < arrayEnter.length; j++) {
                arrayTransformation[j][i] = arrayEnter[j][i];
                System.out.print(arrayTransformation[j][i] + " ");
            }
            System.out.println();
        }
    }

    private static void extracted(int[][] arrayEnter) {
        int counter = 0;
        for (int i = 0; i < arrayEnter.length; i++) {
            for (int j = 0; j < arrayEnter[i].length; j++) {
                arrayEnter[i][j] += counter;
                System.out.print(arrayEnter[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
        System.out.println();
    }
}
