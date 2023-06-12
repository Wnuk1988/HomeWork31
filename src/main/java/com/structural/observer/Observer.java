package com.structural.observer;

import java.util.ArrayList;
import java.util.List;

public class Observer implements Observale {
    public String name;
    public String state;
    public static List<Observer> observers = new ArrayList<>();

    public Observer(String name) {
        this.name = name;
        observers.add(this);
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public void update() {
        System.out.println(name + " change status " + state);
    }
}
