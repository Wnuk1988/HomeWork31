package com.structural.observer;

public class Main {
    public static void main(String[] args) {
        Observer observer = new Observer("Mikail");
        Observer observer1 = new Observer("Natalia");
        observer.setState("New status");
        observer1.setState("Hello!");
    }
}
