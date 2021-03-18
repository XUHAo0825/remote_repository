package com.guru.github.design_pattern.creative.builder;

public class Company {

    public Manager oneType(){
        Manager m = new Manager();
        m.addBus(new BlackBus());
        m.addHuman(new Pretty());
        return m;
    }

    public Manager twoType(){
        Manager m = new Manager();
        m.addBus(new RedBus());
        m.addHuman(new Tom());
        return m;
    }
}
