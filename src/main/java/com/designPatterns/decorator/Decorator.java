package com.designPatterns.decorator;

import com.designPatterns.factoryMethod.Car;

public abstract class Decorator implements Car {
    protected Car car;

    public Decorator (Car car){
        this.car = car;
    }

    public abstract void afterEngineStart();


        public void startEngine(){
            car.startEngine();
            afterEngineStart();
        }
}
