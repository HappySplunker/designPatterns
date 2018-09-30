package com.designPatterns.state;

public class MoveState implements CarState {


    public void action() {
        System.out.println("Car is moving");
    }
}
