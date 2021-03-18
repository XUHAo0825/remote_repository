package com.guru.github.design_pattern.creative.abstract_factory;

public class Holder {

    public static void main(String[] args) {

        AbstractFactory factory = AbstractFactory.getFactory(1);

        PetFactory pet = (PetFactory)factory;
        pet.getPrice(0).howMuch();
    }
}
