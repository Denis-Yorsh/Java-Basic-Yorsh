package com.hillel.PracticeLesson11;

public class PCmouse extends Computer{

    private final int mouse;

    public PCmouse(String processor, String monitor, int weight, int price, int mouse) {
        super(processor, monitor, weight, price);
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "PCmouse {" +
                "mouse = " + mouse +
                ", processor = '" + Computer.getProcessor() + '\'' +
                ", monitor = '" + Computer.getMonitor() + '\'' +
                ", weight = " + Computer.getWeight() +
                ", price = " + Computer.getPrice() +
                "} ";
    }
}
