package com.designPatterns.factoryMethod;

public class CarFactory {

    public Car getCar(RoadType roadType){
        Car car = null;
        switch (roadType){
            case CITY:
                car = new Smart();
                break;
            case COUNTRYSIDE:
                car = new Jeep();
                break;
            case RACETRACK:
                car = new Ferrari();
                break;
            default: car = new Smart();
                break;
        }
        return car;
    }
}
