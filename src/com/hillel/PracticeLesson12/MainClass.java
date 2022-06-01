package com.hillel.PracticeLesson12;

public class MainClass {

    public static void main(String[] args) {

        DaysOfTheWeek friday = DaysOfTheWeek.FRIDAY;
        switch (friday) {
            case MONDAY:
                printMonday();
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                prints();
                break;
            case FRIDAY:
                printFriday();
                break;
            case SATURDAY:
            case SUNDAY:
                printWeekends();
                break;
        }
    }

    private static void printWeekends() {
        System.out.println("Weekends are best.");
    }

    private static void printFriday() {
        System.out.println("Fridays are better.");
    }

    private static void prints() {
        System.out.println("Midweek days are so-so.");
    }

    private static void printMonday() {
        System.out.println("Mondays are bad.");
    }
}
