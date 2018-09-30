package com.designPatterns.factoryMethod;

public class Ferrari implements Car {
    public void startEngine() {
        System.out.println("Engine started loudly");
    }

    public void drive() {
        System.out.println("Driving speed 250 km/h");
    }

    public void stop() {
        System.out.println("Stopped in 14 sec");
    }
}
