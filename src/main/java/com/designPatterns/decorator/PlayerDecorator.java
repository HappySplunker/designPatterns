package com.designPatterns.decorator;

import com.designPatterns.factoryMethod.Car;

public class PlayerDecorator extends Decorator {

    public PlayerDecorator(Car car){
        super(car);
    }

    @Override
    public void afterEngineStart() {
        System.out.println("Music player switched ON");
    }

    public void drive() {

    }

    public void stop() {

    }
}
