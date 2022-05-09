package com.hillel.hwYorsh05;

public class RoundingNumber {

    public static void main(String[] args) {

        double one = doubleToDecimalPlaces(3244.123456789, 1);
        double two = doubleToDecimalPlaces(3244.123456789, 5);

        System.out.println("result of 3 decimal: " + one);
        System.out.println("result of 4 decimal: " + two);

    }

    private static double doubleToDecimalPlaces(double number, int countAfterPoint) {
        String numberString = "" + number;
        String[] massive = numberString.split("\\.");

        String oneMassive = massive[1];
        String numberMetod = oneMassive.substring(0, countAfterPoint);
        String numberMetod1 = oneMassive.substring(countAfterPoint, countAfterPoint + 1);

        String okruglenie = numberMetod.concat(".").concat(numberMetod1);
        int okruglenie1 = (int) Math.round(Double.parseDouble(okruglenie));
        String okruglenie3 = String.valueOf(okruglenie1);


        String result = massive[0].concat(".").concat(okruglenie3);
        return Double.parseDouble(result);
    }
}
