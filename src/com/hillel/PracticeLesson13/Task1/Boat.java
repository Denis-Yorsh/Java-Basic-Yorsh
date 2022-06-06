package com.hillel.PracticeLesson13.Task1;

public class Boat implements Swimmable, Transportable{

    @Override
    public void swim() {
        System.out.println("Swimmable, swim");
    }

    @Override
    public void transpirt() {
        System.out.println("Transportable, transpirt");
    }
}
