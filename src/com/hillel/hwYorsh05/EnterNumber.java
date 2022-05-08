package com.hillel.hwYorsh05;

import java.util.Scanner;

public class EnterNumber {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter yor symbol: ");

        boolean numberInt = enter.hasNextInt();
        boolean numberDouble = enter.hasNextDouble();

        if (numberInt) {
            int numberIntEnter = enter.nextInt();
            String number = numberIntEnter > 0 ? "You entered a positive number = " + numberIntEnter :
                    numberIntEnter == 0 ? "You entered zero" :
                            "You entered a negative number = " + numberIntEnter;
            System.out.println(number);
        } else if (numberDouble) {
            double numberDouble1 = enter.nextDouble();
            double numberDoubleRounding = secondNumberAfterDot(numberDouble1);
            double umberDoubleNotRounding = twoDecimalPlaces(numberDouble1);
            System.out.println("Your enter double with a comma = " + numberDouble1);
            System.out.println("Round to two decimal places = " + numberDoubleRounding);
            System.out.println("Two decimal places, no rounding = " + umberDoubleNotRounding);
        } else {
            String resultString = enter.next();
            String resultStringIndex = String.valueOf(resultString.indexOf("."));
            int result = Integer.parseInt(resultStringIndex);

            if (result > 0) {
                double number = Double.parseDouble(resultString);
                double numberAfterDot = secondNumberAfterDot(number);
                double umberDoubleNotRounding = twoDecimalPlaces(number);
                System.out.println("Your enter double with a comma = " + number);
                System.out.println("Round to two decimal places = " + numberAfterDot);
                System.out.println("Two decimal places, no rounding = " + umberDoubleNotRounding);
            } else {
                String resultStringAll = resultString.toUpperCase();
                System.out.println(resultStringAll);
            }
        }
    }

    public static double secondNumberAfterDot(double number) {

        return Math.round(number * 100) / 100.0;
    }

    public static double twoDecimalPlaces(double number) {
        String number1 = "" + number;
        String[] massive = number1.split("\\.");
        char[] massiveCar = massive[1].toCharArray();
        String resultat = "" + massive[0] + "." + massiveCar[0] + massiveCar[1];
        return Double.parseDouble(resultat);
    }
}
