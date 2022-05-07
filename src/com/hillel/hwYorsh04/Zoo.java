package com.hillel.hwYorsh04;

public class Zoo {

    public static void main(String[] args) {

        int min = 2;
        int max = 30;

        int bear = (int) (Math.random() * ((max - min) + 1) + min);
        int tiger = (int) (Math.random() * ((max - min) + 1) + min);
        int parrot = (int) (Math.random() * ((max - min) + 1) + min);
        int elephant = (int) (Math.random() * ((max - min) + 1) + min);
        int raccoon = (int) (Math.random() * ((max - min) + 1) + min);
        int porcupine = (int) (Math.random() * ((max - min) + 1) + min);

        int summaAll = countAnimals(bear, tiger, parrot, elephant, raccoon);
        int summaСoefficient = countAnimalsNextYear(bear, tiger, parrot, elephant, raccoon);
        int summaPlusOnePlusСoefficient = countAnimalsNextYear(bear, tiger, parrot, elephant, raccoon, porcupine);

        System.out.println(summaAll);
        System.out.println(summaСoefficient);
        System.out.println(summaPlusOnePlusСoefficient);
    }

    public static int countAnimals(int bear, int tiger, int parrot, int elephant, int raccoon) {
        return bear + tiger + parrot + elephant + raccoon;
    }

    public static int countAnimalsNextYear(int bear, int tiger, int parrot, int elephant, int raccoon) {
        return (int) ((bear + (bear * 0.3)) + (tiger + (tiger * 0.2)) +
                (parrot + (parrot * 0.4)) + (elephant + (elephant * 0.05)) + (raccoon + (raccoon * 0.8)));
    }

    public static int countAnimalsNextYear(int bear, int tiger, int parrot, int elephant, int raccoon, int porcupine) {
        return (int) ((bear + (bear * 0.3)) + (tiger + (tiger * 0.2)) +
                (parrot + (parrot * 0.4)) + (elephant + (elephant * 0.05)) +
                (raccoon + (raccoon * 0.8)) + (porcupine + (porcupine * 0.15)));
    }
}
