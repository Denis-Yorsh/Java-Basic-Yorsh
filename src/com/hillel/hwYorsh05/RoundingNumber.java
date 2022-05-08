package com.hillel.hwYorsh05;

import java.util.Locale;

public class RoundingNumber {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double one = doubleToDecimalPlaces(2334.332455, 3);
        double two = doubleToDecimalPlaces(2334.334485, 4);
        double three = doubleToDecimalPlaces(2334.334475, 5);

        System.out.println("result of 3 decimal: " + one);
        System.out.println("result of 4 decimal: " + two);
        System.out.println("result of 5 decimal: " + three + "\n");

        double four = doubleToDecimalPlaces1(2334.332455, 3);
        double five = doubleToDecimalPlaces1(2334.334485, 4);
        double six = doubleToDecimalPlaces1(2334.334475, 5);

        System.out.println("result of 3 decimal: " + four);
        System.out.println("result of 4 decimal: " + five);
        System.out.println("result of 5 decimal: " + six);
    }

    private static double doubleToDecimalPlaces(double number, int countAfterPoint) {
        String numberString = "" + number;
        String[] massive = numberString.split("\\.");

        String oneMassive = massive[1];
        String numberMetod = oneMassive.substring(0, countAfterPoint);

        String result = massive[0].concat(".").concat(numberMetod);
        return Double.parseDouble(result);
    }

    private static double doubleToDecimalPlaces1(double number, int countAfterPoint) {
        switch (countAfterPoint) {
            case 1:
                return Double.parseDouble(String.format("%.1f", number));
            case 2:
                return Double.parseDouble(String.format("%.2f", number));
            case 3:
                return Double.parseDouble(String.format("%.3f", number));
            case 4:
                return Double.parseDouble(String.format("%.4f", number));
            case 5:
                return Double.parseDouble(String.format("%.5f", number));
            case 6:
                return Double.parseDouble(String.format("%.6f", number));
            case 7:
                return Double.parseDouble(String.format("%.7f", number));
            case 8:
                return Double.parseDouble(String.format("%.8f", number));
            case 9:
                return Double.parseDouble(String.format("%.9f", number));
        }
        return 0;
    }
}
