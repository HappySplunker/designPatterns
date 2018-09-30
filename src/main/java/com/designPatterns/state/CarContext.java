package com.designPatterns.state;

public class CarContext implements CarState {


    private CarState state;

    public CarState getState() {
        return state;
    }

    public void setState(CarState state) {
        this.state = state;
    }


    public void action() {
        this.state.action();
    }
}
