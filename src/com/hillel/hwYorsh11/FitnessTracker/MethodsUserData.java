package com.hillel.hwYorsh11.FitnessTracker;

public class MethodsUserData {

    protected static void printUserData(String FIRST_NAME, String lastName,
                              int DATE_OF_BIRDTH_DAY, int DATE_OF_BIRDTH_MONTH,
                              int DATE_OF_BIRDTH_YEAR, String EMAIL, String PHONE_NUMBER,
                              int theWeight, String pressure, int steps) {
        int age = userAge(DATE_OF_BIRDTH_YEAR);
        System.out.printf("Name: %s %s \\ Date of Birth: %d.%d.%d \\ Age: %d\nMail: %s" +
                "\\ Phone Number: %s\nThe Weight: %d \\ Pressure: %s \\ Steps: %d\n\n",
                FIRST_NAME, lastName, DATE_OF_BIRDTH_DAY, DATE_OF_BIRDTH_MONTH,
                DATE_OF_BIRDTH_YEAR, age, EMAIL, PHONE_NUMBER, theWeight, pressure, steps);
    }

    protected static int userAge(int UserYear) {
        return 2022 - UserYear;
    }
}
