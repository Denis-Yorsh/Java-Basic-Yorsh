package com.hillel;

public class ProgramsFrequent {

    public static void twoArrayToString(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "|  \t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
