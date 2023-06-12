package com.structural.responsibility;

public class Main {
    public static void main(String[] args) {
        MessagePrinter messagePrinter = new ConsoleMessagePrinter();
        FileMessagePrinter fileMessagePrinter = new FileMessagePrinter();
        messagePrinter.setNexMessagePrinter(fileMessagePrinter);
        fileMessagePrinter.setNexMessagePrinter(new DbMessagePrinter());
        messagePrinter.print("Hello developer!");
    }
}
