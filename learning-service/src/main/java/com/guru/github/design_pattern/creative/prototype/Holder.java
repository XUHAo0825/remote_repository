package com.guru.github.design_pattern.creative.prototype;

public class Holder {

    public static void main(String[] args) {

        Store.setToy();

        Store store = new Store();
        System.out.println(store.getToy("Bear").toString());
    }
}
