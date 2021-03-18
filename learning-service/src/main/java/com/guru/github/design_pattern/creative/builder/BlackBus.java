package com.guru.github.design_pattern.creative.builder;

public class BlackBus implements Bus {

    public void type() {
        System.out.println("Black Bus");
    }

    public int price() {
        return 500;
    }
}
