package com.hillel.hwYorsh06;

public class Triangle {

    public static void main(String[] args) {

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (j > i) {
                    System.out.print("  ");
                } else {
                    System.out.print(1 + (i - j) + " ");
                }
            }
            System.out.println();
        }
    }
}
