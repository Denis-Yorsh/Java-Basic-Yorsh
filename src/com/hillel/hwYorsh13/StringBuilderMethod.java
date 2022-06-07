package com.hillel.hwYorsh13;

import java.util.Arrays;

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
        char[] uniqueChars = uniqueChars(toStrings, toStrings.length());
        //display on screen
        System.out.println(Arrays.toString(uniqueChars));
    }

    private static char[] uniqueChars(String s, int length) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        System.out.println(array);

        if (length == 0 || length == 1) {
            return s.toCharArray();
        }

        char[] tempA = new char[length];
        char j = 0;
        for (int i = 0; i < length - 1; i++) {
            if (array[i] != array[i + 1]) {
                tempA[j++] = array[i];
            }
        }
        tempA[j++] = array[length-1];
        for (int i=0; i<j; i++){
            array[i] = tempA[i];
        }
        return tempA;
    }
}
