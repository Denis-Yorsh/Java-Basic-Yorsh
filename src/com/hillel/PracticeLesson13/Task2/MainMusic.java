package com.hillel.PracticeLesson13.Task2;

public class MainMusic {

    public static void main(String[] args) {

        MusicStyles pop = new PopMusic();
        MusicStyles rock = new RockMusic();
        MusicStyles classic = new ClassicMusic();

        MusicStyles[] music = {pop, rock, classic};
        for (MusicStyles styles : music) {
            System.out.println(styles.playMusic());
        }
    }
}
