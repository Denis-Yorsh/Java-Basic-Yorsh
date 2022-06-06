package com.hillel.PracticeLesson13.Task1;

public class MeinClass {

    public static void main(String[] args) {

        Swimmable duck = new Duck();
        duck.swim();

        Swimmable human = new Human();
        human.swim();

        Swimmable boat = new Boat();
        boat.swim();
        Transportable boatTwo = (Transportable) boat;
        boatTwo.transpirt();
    }
}
