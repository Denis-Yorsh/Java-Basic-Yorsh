package com.hillel.PracticeLesson11;

public class ComputerShop {

    public static void main(String[] args) {

        Computer computer = new Computer("Amd", "LG", 2, 1500);
        Computer pcMouse = new PCmouse("Intel", "LG", 2, 1700, 1);
        Computer notebookTouchpad = new NotebookTouchpad
                ("Amd", "Samsung", 2, 1900, 1);
        Computer consoleJoystick = new ConsoleJoystick
                ("Intel", "LG", 2, 2000, 1);

        System.out.println(computer);
        System.out.println(pcMouse);
        System.out.println(notebookTouchpad);
        System.out.println(consoleJoystick);
        System.out.println("\nComputer count: "+ Computer.getCount());
    }
}
