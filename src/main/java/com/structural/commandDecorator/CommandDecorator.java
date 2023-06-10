package com.structural.commandDecorator;

public class CommandDecorator implements Command{
   public Command command;

    public CommandDecorator(Command command) {
        this.command = command;
    }

    @Override
    public void oder() {
        command.oder();
    }
}
