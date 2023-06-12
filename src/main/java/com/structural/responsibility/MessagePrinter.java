package com.structural.responsibility;

public abstract class MessagePrinter {
    MessagePrinter nexMessagePrinter;

    public void setNexMessagePrinter(MessagePrinter nexMessagePrinter) {
        this.nexMessagePrinter = nexMessagePrinter;
    }
    public void print(String message){
        printMessage(message);
        if (nexMessagePrinter != null){
            nexMessagePrinter.print(message);
        }

    }
    abstract void printMessage(String message);
}
