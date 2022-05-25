package com.hillel.hwYorsh09;

import com.hillel.ProgramsFrequent;

import java.util.Random;

public class MatrixData {

    public static void main(String[] args) {

        int[][] matrixC = new int[3][3];
        int[][] matrixD = new int[3][3];

        System.out.println("MatrixC random:");
        extracted(matrixC);
        System.out.println("MatrixD random:");
        extracted(matrixD);
        extractedPlus(matrixC, matrixD);
        extractedMultiply(matrixC, matrixD);
    }

    private static void extracted(int[][] matrix) {
        Random randomMatrix = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomMatrix.nextInt(100);
            }
        }
        ProgramsFrequent.twoArrayToString(matrix);
    }

    private static void extractedPlus(int[][] matrixC, int[][] matrixD) {
        int[][] matrixCD = new int[3][3];
        System.out.println("Matrix C + D:");
        for (int i = 0; i < matrixCD.length; i++) {
            for (int j = 0; j < matrixCD[i].length; j++) {
                matrixCD[i][j] = matrixC[i][j] + matrixD[i][j];
            }
        }
        ProgramsFrequent.twoArrayToString(matrixCD);
    }

    private static void extractedMultiply(int[][] matrixC, int[][] matrixD) {
        int[][] matrixCD = new int[3][3];
        System.out.println("Matrix C * D:");
        for (int i = 0; i < matrixCD.length; i++) {
            for (int j = 0; j < matrixCD[i].length; j++) {
                matrixCD[i][j] = matrixC[i][j] * matrixD[i][j];
            }
        }
        ProgramsFrequent.twoArrayToString(matrixCD);
    }
}
