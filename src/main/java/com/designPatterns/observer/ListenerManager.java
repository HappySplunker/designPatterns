package com.designPatterns.observer;

import java.util.ArrayList;

public class ListenerManager implements Indicator {

    private ArrayList<ActionListener> listeners = new ArrayList();

    public ArrayList<ActionListener> getListeners() {
        return listeners;
    }

    public void addListener(ActionListener listener) {
        listeners.add(listener);
    }

    public void removeListener(ActionListener listener) {
        listeners.remove(listener);
    }

    public void removeAllListeners() {
        listeners.clear();
    }

    public void notifyDriver(String message) {
        for (ActionListener actionListener : listeners) {
            actionListener.notify(message);
        }
    }

    public void createNewMessage(String message){
        System.out.println("Indicator shows "+message);
        notifyDriver(message);
    }
}
