package com.designPatterns.state;

public class Start {

    public static void main(String[] args) {

        CarContext context = new CarContext();

        CarState moveState = new MoveState();
        CarState parkingState = new ParkingState();

        context.setState(moveState);
        context.action();

        context.setState(parkingState);
        context.action();
    }
}
