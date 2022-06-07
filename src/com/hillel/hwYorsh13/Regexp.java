package com.hillel.hwYorsh13;

public class Regexp {

    public static void main(String[] args) {

        String[] array = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};
        //String[] translate String because the method takes the String
        String arrayToString = arrayToString(array);
        //send to method heckPersonWithRegExp String
        checkPersonWithRegExp(arrayToString);
    }

    public static void checkPersonWithRegExp(String userNameString) {
        //String translate String[], check [i] element for equality
        // and display on screen [i] element is true or is false
        String[] arrays = userNameString.split(",");
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].matches("[A-Z]{1}[a-z]+")) {
                System.out.println(arrays[i] + " is true");
            } else {
                System.out.println(arrays[i] + " is false");
            }
        }
    }

    private static String arrayToString(String[] array) {
        //use StringBuilder to save memory and (,) to save space in array
        StringBuilder isString = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            isString.append(array[i]).append(i == array.length - 1 ? "" : ",");
        }
        return isString.toString();
    }
}
