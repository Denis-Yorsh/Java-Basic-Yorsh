package com.hillel.hwYorsh11.FitnessTracker;

public class UserData {

    private static int count;
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

    public UserData(String FIRST_NAME, String lastName, int DATE_OF_BIRDTH_DAY,
                    int DATE_OF_BIRDTH_MONTH, int DATE_OF_BIRDTH_YEAR, String EMAIL,
                    String PHONE_NUMBER, int theWeight, String pressure, int steps) {
        this.FIRST_NAME = FIRST_NAME;
        this.lastName = lastName;
        this.DATE_OF_BIRDTH_DAY = DATE_OF_BIRDTH_DAY;
        this.DATE_OF_BIRDTH_MONTH = DATE_OF_BIRDTH_MONTH;
        this.DATE_OF_BIRDTH_YEAR = DATE_OF_BIRDTH_YEAR;
        this.EMAIL = EMAIL;
        this.PHONE_NUMBER = PHONE_NUMBER;
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
