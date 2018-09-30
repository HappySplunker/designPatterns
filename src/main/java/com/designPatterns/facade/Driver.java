package com.designPatterns.facade;

public class Driver {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();
        carFacade.drive();
    }
}
