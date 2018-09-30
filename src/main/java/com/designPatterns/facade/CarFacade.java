package com.designPatterns.facade;

public class CarFacade {
    private Door door = new Door();
    private Wheels wheels = new Wheels();



        public void drive(){
            door.openDoor();
            door.closeDoor();
            wheels.turnWheels();
        }
}
