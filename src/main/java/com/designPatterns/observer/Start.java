package com.designPatterns.observer;

public class Start {
    public static void main(String[] args) {
        Driver driver = new Driver();

        ListenerManager listenerManager = new ListenerManager();

        listenerManager.addListener(driver);

        listenerManager.createNewMessage("It's time to replace oil");
        listenerManager.createNewMessage("It's time to refill fuel");
    }
}
