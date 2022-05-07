package com.hillel.hwYorsh03;

public class TwoArmies {

    public static void main(String[] args) {

        int liaWarrior = 13;
        int liArcher = 24;
        int liRider = 46;
        int minWarrior = 9;
        int minArcher = 35;
        int minRider = 12;

        int forceLi = (liaWarrior + liArcher + liRider) * 860;
        int forceMin = (minWarrior + minArcher + minRider) * (int) (860 * 1.5);

        System.out.println("Attack army Li = " + forceLi);
        System.out.println("Attack army Min = " + forceMin);
    }
}
