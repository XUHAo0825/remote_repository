package com.guru.github.design_pattern.creative.singleton;

public class SingletonMethod {

    private SingletonMethod(){}//私有构造方法 外部不可再实例化

    private static SingletonMethod object = new SingletonMethod();//饿汉

    private static class StaticHolder{
        private static final SingletonMethod internal = new SingletonMethod();
    }

    public static SingletonMethod getInstance(){
        dhl();
        return object;
    }

    /**
     * 双检锁机制 懒汉
     */
    private static void dhl(){
        if(object == null){
            synchronized (SingletonMethod.class){
                if(object == null){
                    object = new SingletonMethod();
                }
            }
        }
    }

    /**
     * 获取静态内部类实例对象 懒汉
     */
    private static void staticInternalClass(){
        if(object == null){
            object = StaticHolder.internal;
        }
    }

    void sayHello(){
        System.out.println("Hi, This is a Singleton model.");
    }
}
