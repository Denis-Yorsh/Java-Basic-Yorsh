package com.hillel.hwYorsh02;

public class LatitudeLongitude {

    public static void main(String[] args) {

        String latitude = "49°58′50";
        String longitude = "36°15′09";
        int seaLevel = 113;

        System.out.printf("The city of Kharkiv is located at %s north latitude " +
                "and %s east longitude at an altitude " +
                "of %s meters above sea level.", latitude, longitude, seaLevel);
    }
}
