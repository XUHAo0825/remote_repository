package com.guru.github.design_pattern.creative.abstract_factory;

import com.guru.github.design_pattern.creative.factory.FoodFactory;

public class AbstractFactory {

    static AbstractFactory getFactory(int i){
        return i <= 0 ? new FoodFactory() : new PetFactory();
    }
}
