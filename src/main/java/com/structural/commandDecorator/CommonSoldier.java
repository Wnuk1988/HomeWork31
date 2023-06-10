package com.structural.commandDecorator;

public class CommonSoldier implements Command{
    @Override
    public void oder() {
        System.out.println("I follow orders!");
    }
}
