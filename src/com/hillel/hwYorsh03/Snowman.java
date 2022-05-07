package com.hillel.hwYorsh03;

public class Snowman {

    /**
     * p = m/v
     * обьем V = 3/4*П*Rˆ3
     * R = D/2
     */

    public static void main(String[] args) {

        int bollOne = 1;
        double bollTwo = 0.5;
        double bollThree = 0.2;
        double strength = 0.7;

        double volumeBollOne = 3. / 4 * Math.PI * Math.pow(bollOne / 2., 3);
        double volumeBollTwo = 3. / 4 * Math.PI * Math.pow(bollTwo / 2, 3);
        double volumeBollThree = 3. / 4 * Math.PI * Math.pow(bollThree / 2, 3);

        double weightBollOne = strength / volumeBollOne;
        double weightBollTwo = strength / volumeBollTwo;
        double weightBollThree = strength / volumeBollThree;

        double weightAllBoll = weightBollOne + weightBollTwo + weightBollThree;
        System.out.println("Snowman weighs = " + weightAllBoll);
    }
}
