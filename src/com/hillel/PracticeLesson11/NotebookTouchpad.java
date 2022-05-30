package com.hillel.PracticeLesson11;

public class NotebookTouchpad extends Computer{

    private final int touchpad;

    public NotebookTouchpad(String processor, String monitor, int weight, int price, int touchpad) {
        super(processor, monitor, weight, price);
        this.touchpad = touchpad;
    }

    @Override
    public String toString() {
        return "NotebookTouchpad {" +
                "touchpad = " + touchpad +
                ", processor = '" + Computer.getProcessor() + '\'' +
                ", monitor = '" + Computer.getMonitor() + '\'' +
                ", weight = " + Computer.getWeight() +
                ", price = " + Computer.getPrice() +
                "} ";
    }

}
