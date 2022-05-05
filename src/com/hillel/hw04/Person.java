package com.hillel.hw04;

public class Person {

    public static void main(String[] args) {

        String citizenOne = personInfo("Will", "Smith", "New York", 2936729462846L);
        String citizenTwo = personInfo("Jackie", "Chan", "Shanghai", 12312412412L);
        String citizenThree = personInfo("Sherlock", "Holmes", "NLondon", 2936729462568L);

        System.out.println(citizenOne);
        System.out.println(citizenTwo);
        System.out.println(citizenThree);
    }

    public static String personInfo(String name, String surname, String sity, long tell) {
        return "Call a citizen " + name + " " + surname + " from the city " + sity + " you can for the number " + tell;
    }
}
