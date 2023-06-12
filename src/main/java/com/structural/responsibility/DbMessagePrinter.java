package com.structural.responsibility;

public class DbMessagePrinter extends MessagePrinter{
    @Override
    void printMessage(String message) {
        System.out.println("Print to Db: " + message);
    }
}
