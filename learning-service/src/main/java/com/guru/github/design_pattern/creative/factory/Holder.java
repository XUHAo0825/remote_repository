package com.guru.github.design_pattern.creative.factory;

public class Holder {

    public static void main(String[] args) {
        FoodFactory factory = new FoodFactory();
        factory.getPrice(0).howMuch();
        factory.getPrice(1).howMuch();
    }
}
