package com.hillel.PracticeLesson11;

public class Computer {

    private static int count;
    private static String processor;
    private static String monitor;
    private static int weight;
    private static int price;

    public Computer(String processor, String monitor, int weight, int price) {
        Computer.processor = processor;
        Computer.monitor = monitor;
        Computer.weight = weight;
        Computer.price = price;
        countComputer();
    }

    public static int getCount() {
        return count;
    }

    public static String getProcessor() {
        return processor;
    }

    public static String getMonitor() {
        return monitor;
    }

    public static int getWeight() {
        return weight;
    }

    public static int getPrice() {
        return price;
    }
    protected void countComputer(){
        count = count + 1;
    }

    @Override
    public String toString() {
        return "Computer {" +
                "processor = '" + processor + '\'' +
                ", monitor = '" + monitor + '\'' +
                ", weight = " + weight +
                ", price = " + price +
                '}';
    }
}
