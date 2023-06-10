package com.structural.commandDecorator;

public class Sergeant extends CommandDecorator{
    public Sergeant(Command command) {
        super(command);
    }

    @Override
    public void oder() {
        super.oder();
        System.out.println("I can issue orders to the squad.");
    }
}
