package com.guru.github.design_pattern.creative.builder;

public class RedBus implements Bus {

    public void type() {
        System.out.println("Red Bus");
    }

    public int price() {
        return 100;
    }
}
