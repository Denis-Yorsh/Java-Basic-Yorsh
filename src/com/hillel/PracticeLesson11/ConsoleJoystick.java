package com.hillel.PracticeLesson11;

public class ConsoleJoystick extends Computer {

    private final int joystick;

    public ConsoleJoystick(String processor, String monitor, int weight, int price, int joystick) {
        super(processor, monitor, weight, price);
        this.joystick = joystick;
    }

    @Override
    public String toString() {
        return "ConsoleJoystick {" +
                "joystick = " + joystick +
                ", processor = '" + Computer.getProcessor() + '\'' +
                ", monitor = '" + Computer.getMonitor() + '\'' +
                ", weight = " + Computer.getWeight() +
                ", price = " + Computer.getPrice() +
                '}';
    }
}
