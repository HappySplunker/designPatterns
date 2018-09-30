package com.designPatterns.factoryMethod;

public class Jeep implements Car {
    public void startEngine() {
        System.out.println("Engine started");
    }

    public void drive() {
        System.out.println("Driving speed 40 km/h");
    }

    public void stop() {
        System.out.println("Stopped in 3 sec");

    }
}
