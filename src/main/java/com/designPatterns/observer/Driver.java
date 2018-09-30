package com.designPatterns.observer;

public class Driver implements ActionListener {

    public void notify(String message) {
        System.out.println(message + " from "+ this.getClass().getName());
    }
}
