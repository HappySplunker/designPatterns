package com.designPatterns.factoryMethod;

public class Smart implements Car {

    public void startEngine() {
        System.out.println("Engine started quietly");
    }

    public void drive() {
        System.out.println("Driving Speed 50 km/h");
    }

    public void stop() {
        System.out.println("Stopped in 5 sec");
    }
}
