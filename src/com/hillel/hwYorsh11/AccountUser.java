package com.hillel.hwYorsh11;

public class AccountUser {

    public static void main(String[] args) {

        UserData humanPopov = new UserData("Mark", "Popov", 23,
                5, 1990, "popov@maill.com",
                "093-42-56-400", 83, "120/70", 3750);
        UserData humanVishenko = new UserData("Gas", "Vishenko", 15,
                9, 1985, "Vishenko@maill.com",
                "097-43-51-467", 95, "130/65", 2550);
        UserData humanVolkov = new UserData("Tom", "Volkov", 29,
                3, 1987, "Volkov@maill.com",
                "066-22-46-490", 70, "120/60", 4350);
        UserData humanFranko = new UserData("Bred", "Franko", 9,
                12, 1980, "Franko@maill.com",
                "099-65-21-567", 85, "125/75", 3550);
        UserData humanPampushka = new UserData("Oksana", "Pampushka", 15,
                11, 2001, "Pampushka@maill.com",
                "093-10-54-897", 65, "120/60", 6750);

        humanPopov.printAccountInfo();
        humanVishenko.printAccountInfo();
        humanVolkov.printAccountInfo();
        humanFranko.printAccountInfo();
        humanPampushka.printAccountInfo();

        humanVolkov.setLastName("Kikibidze");
        humanVolkov.setPressure("130/70");
        humanVolkov.setTheWeight(90);
        humanVolkov.setSteps(1100);
        humanVolkov.printAccountInfo();

        humanPampushka.setLastName("Kikibidze");
        humanPampushka.setTheWeight(63);
        humanPampushka.setSteps(9375);
        humanPampushka.printAccountInfo();
    }
}
