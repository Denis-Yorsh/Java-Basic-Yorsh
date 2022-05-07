package com.hillel.hwYorsh03;

import java.util.Scanner;

public class MinMaxNumber {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter min number: ");
        int minNumber = enter.nextInt();
        System.out.print("Enter max number: ");
        int maxNumber = enter.nextInt();

        int random = (int) (Math.random() * ((maxNumber - minNumber) + 1) + minNumber);

        System.out.println(random);
    }
}
