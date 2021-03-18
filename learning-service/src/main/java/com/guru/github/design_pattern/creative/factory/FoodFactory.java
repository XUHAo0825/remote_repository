package com.guru.github.design_pattern.creative.factory;

import com.guru.github.design_pattern.creative.abstract_factory.AbstractFactory;

public class FoodFactory extends AbstractFactory {

    Food getPrice(int i){

        return i <= 0 ? new Apple() : new Tomato();
    }
}
