package com.hillel.hwYorsh13;

public class StringBuilderMethod {

    public static void main(String[] args) {

        StringBuilder isStringBuilder = new StringBuilder("Using methods of class String");
        //translate char[] and display on screen
        printCharArray(isStringBuilder);
    }

    private static void printCharArray(StringBuilder string) {
        //StringBuilder translate String
        String toStrings = string.toString();
        //translate char[] method uniqueChars
        char[] uniqueChars = uniqueChars(toStrings);
        //display on screen
        System.out.println(uniqueChars);
    }

    private static char[] uniqueChars(String s) {
        return s.toCharArray();
    }
}
