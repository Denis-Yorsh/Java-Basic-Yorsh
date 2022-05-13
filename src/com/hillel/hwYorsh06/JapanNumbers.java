package com.hillel.hwYorsh06;

public class JapanNumbers {

    public static void main(String[] args) {
        int unluckyNumberFour = 0;
        int unluckyNumberNine = 0;
        for (int i = 1; i <= 100; i++) {
            if (i == 4 + unluckyNumberFour) {
                unluckyNumberFour += 10;
                continue;
            } else if (i == 9 + unluckyNumberNine) {
                unluckyNumberNine += 10;
                continue;
            } else if (i >= 40 && i < 50 || i >= 90 && i < 100){
                continue;
            } else {
                System.out.println("Space shuttle № "+i);
            }
        }
    }
}
