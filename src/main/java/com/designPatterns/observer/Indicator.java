package com.designPatterns.observer;

import java.util.ArrayList;

public interface Indicator {
    ArrayList<ActionListener> getListeners();

    void addListener(ActionListener listener);

    public void removeListener(ActionListener listener);

    public void removeAllListeners();

    public void notifyDriver(String message);
}
