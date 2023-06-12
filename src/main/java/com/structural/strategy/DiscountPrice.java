package com.structural.strategy;

public class DiscountPrice implements Strategy{
    @Override
    public double getPrice(double price) {
        return price*0.8;
    }
}
