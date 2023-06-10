package com.structural.commandDecorator;

public class OfficerLieutenant extends CommandDecorator{
    public OfficerLieutenant(Command command) {
        super(command);
    }

    @Override
    public void oder() {
        super.oder();
        System.out.println("I can give orders to the platoon.");
    }
}
