package com.designPatterns.decorator;

import com.designPatterns.factoryMethod.Ferrari;
import com.designPatterns.factoryMethod.Jeep;
import com.designPatterns.factoryMethod.Smart;
import com.designPatterns.factoryMethod.Car;

public class MusicStart {


    public static void main(String[] args) {

    Car smartWithMusic = new PlayerDecorator(new Smart());

    Car jeepWithMusic = new PlayerDecorator(new Jeep());

    Car ferrariWithMusic = new PlayerDecorator(new Ferrari());

    smartWithMusic.startEngine();
    jeepWithMusic.startEngine();
    ferrariWithMusic.startEngine();
    }
}
