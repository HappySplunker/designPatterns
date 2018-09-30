package com.designPatterns.factoryMethod;

public class Start {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car car = carFactory.getCar(RoadType.CITY);
        car.startEngine();
        car.drive();
        car.stop();

        car = carFactory.getCar(RoadType.COUNTRYSIDE);
        car.startEngine();
        car.drive();
        car.stop();


        car = carFactory.getCar(RoadType.RACETRACK);
        car.startEngine();
        car.drive();
        car.stop();
    }
}
