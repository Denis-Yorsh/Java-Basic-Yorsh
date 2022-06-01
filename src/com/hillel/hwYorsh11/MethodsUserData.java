package com.hillel.hwYorsh11;

public class MethodsUserData {

    protected static void printUserData(String firstName, String lastName,
                                        int dateOfBirdthDay, int dateOfBirdthMonht,
                                        int dateOfBirdthYear, String email, String phoneNumber,
                                        int theWeight, String pressure, int steps) {
        int age = userAge(dateOfBirdthYear);
        System.out.printf("Name: %s %s \\ Date of Birth: %d.%d.%d \\ Age: %d\nMail: %s" +
                "\\ Phone Number: %s\nThe Weight: %d \\ Pressure: %s \\ Steps: %d\n\n",
                firstName, lastName, dateOfBirdthDay, dateOfBirdthMonht,
                dateOfBirdthYear, age, email, phoneNumber, theWeight, pressure, steps);
    }

    protected static int userAge(int UserYear) {
        return 2022 - UserYear;
    }
}
