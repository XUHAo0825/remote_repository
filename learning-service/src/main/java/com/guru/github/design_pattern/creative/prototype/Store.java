package com.guru.github.design_pattern.creative.prototype;

import java.util.HashMap;
import java.util.Map;

public class Store {

    private static final Map<String,ProtoType> protoTypeMap = new HashMap<String, ProtoType>();

    public static void setToy(){
        protoTypeMap.put("Bear",new ProtoType("Bear"));
        protoTypeMap.put("Monkey",new ProtoType("Monkey"));
        protoTypeMap.put("LittleCar",new ProtoType("LittleCar"));
    }

    public ProtoType getToy(String name){
        try {
            return (ProtoType)protoTypeMap.get(name).clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
