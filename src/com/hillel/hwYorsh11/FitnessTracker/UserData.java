package com.hillel.hwYorsh11.FitnessTracker;

public class UserData {

    private final String FIRST_NAME;
    private String lastName;
    private final int DATE_OF_BIRDTH_DAY;
    private final int DATE_OF_BIRDTH_MONTH;
    private final int DATE_OF_BIRDTH_YEAR;
    private final String EMAIL;
    private final String PHONE_NUMBER;
    private int theWeight;
    private String pressure;
    private int steps;

    public UserData(String firstName, String lastName, int dateOfBirdthDay,
                    int dateOfBirdthMonth, int dateOfBirdthYear, String email,
                    String phoneNumber, int theWeight, String pressure, int steps) {
        this.FIRST_NAME = firstName;
        this.lastName = lastName;
        this.DATE_OF_BIRDTH_DAY = dateOfBirdthDay;
        this.DATE_OF_BIRDTH_MONTH = dateOfBirdthMonth;
        this.DATE_OF_BIRDTH_YEAR = dateOfBirdthYear;
        this.EMAIL = email;
        this.PHONE_NUMBER = phoneNumber;
        this.theWeight = theWeight;
        this.pressure = pressure;
        this.steps = steps;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTheWeight(int theWeight) {
        this.theWeight = theWeight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    protected void printAccountInfo() {
        MethodsUserData.printUserData(this.FIRST_NAME, this.lastName, this.DATE_OF_BIRDTH_DAY,
                this.DATE_OF_BIRDTH_MONTH, this.DATE_OF_BIRDTH_YEAR, this.EMAIL,
                this.PHONE_NUMBER, this.theWeight, this.pressure, this.steps);
    }
}
