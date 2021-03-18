package com.guru.github.design_pattern.creative.builder;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    private List<Bus> busList = new ArrayList<Bus>();
    private List<Human> humans = new ArrayList<Human>();

    public void addBus(Bus bus) {
        busList.add(bus);
    }

    public void addHuman(Human human) {
        humans.add(human);
    }

    public void showOurs(){
        for (Bus bus : busList) {
            System.out.println(bus.price());
            bus.type();
        }
        for (Human human : humans) {
            System.out.println(human.age());
            System.out.println(human.address());
        }
    }
}
