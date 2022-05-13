package com.hillel.hwYorsh06;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int isFibo0 = 0;
        int isFibo1 = 1;
        int isFibo2 = 1;
        int isFibo3;

        System.out.print(isFibo0+" "+isFibo1+" "+isFibo2+" ");

        for (int i = 3; i < 11; i++) {
            isFibo3 = isFibo1 + isFibo2;
            System.out.print(isFibo3+" ");
            isFibo1 = isFibo2;
            isFibo2 =  isFibo3;
        }
    }
}
