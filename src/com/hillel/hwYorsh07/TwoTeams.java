package com.hillel.hwYorsh07;

import java.util.Arrays;
import java.util.Random;

public class TwoTeams {

    public static void main(String[] args) {
        Random random = new Random();
        int maxOld = 22;
        int sumaOne = 0;
        int sumaOnePlayer = 0;
        int sumaOneAll = 0;
        int sumaTwo = 0;
        int sumaTwoPlayer = 0;
        int sumaTwoAll = 0;
        int[] arrayTeamsOne = new int[25];
        int[] arrayTeamsTwo = new int[25];

        System.out.println("Age of all first team players\n");
        for (int i = 0; i < arrayTeamsOne.length; i++) {
            arrayTeamsOne[i] = 18 + random.nextInt(maxOld + 1);
        }
        for (int i = 0; i < arrayTeamsOne.length; i++) {
            sumaOne += arrayTeamsOne[i];
            sumaOnePlayer = arrayTeamsOne[i];
            System.out.printf("Player %s his age %s\n", i + 1, sumaOnePlayer);
        }
        sumaOneAll = sumaOne / 25;
        System.out.println("Average age of a first team player - " + sumaOneAll + "\n");

        System.out.println("Age of all players of the second team\n");
        for (int i = 0; i < arrayTeamsTwo.length; i++) {
            arrayTeamsTwo[i] = 18 + random.nextInt(maxOld + 1);
        }
        for (int i = 0; i < arrayTeamsTwo.length; i++) {
            sumaTwo += arrayTeamsTwo[i];
            sumaTwoPlayer = arrayTeamsTwo[i];
            System.out.printf("Player %s his age %s\n", i + 1, sumaTwoPlayer);
        }
        sumaTwoAll = sumaTwo / 25;
        System.out.println("Average age of a second team player - " + sumaTwoAll);
        System.out.println();

        System.out.println("Age of all first team players");
        System.out.println(Arrays.toString(arrayTeamsOne));
        System.out.println("Average age of a first team player - " + sumaOneAll + "\n");

        System.out.println("Age of all players of the second team");
        System.out.println(Arrays.toString(arrayTeamsTwo));
        System.out.println("Average age of a second team player - " + sumaTwoAll);
    }
}
