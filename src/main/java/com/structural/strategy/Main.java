package com.structural.strategy;

public class Main {
    public static void main(String[] args) {
        double startPrice = 80;
        ContextStrategy contextStrategy = new ContextStrategy(new DiscountPrice());
        double nowPrice = contextStrategy.getPrice(startPrice);
        System.out.println(nowPrice);
    }
}
