package com.structural.responsibility;

public class FileMessagePrinter extends MessagePrinter {
    @Override
    void printMessage(String message) {
        System.out.println("Print to file: " + message);
    }
}
