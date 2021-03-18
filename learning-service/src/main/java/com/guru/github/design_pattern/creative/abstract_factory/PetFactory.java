package com.guru.github.design_pattern.creative.abstract_factory;

public class PetFactory extends AbstractFactory{

    IPet getPrice(int i){

        return i <= 0 ? new Cat() : new Dog();
    }
}
