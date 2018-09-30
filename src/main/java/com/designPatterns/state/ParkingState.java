package com.designPatterns.state;

public class ParkingState implements CarState {

    public void action() {
        System.out.println("Car is standing");
    }
}
