package com.guru.github.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        final Producer producer = new Producer();

        //producer.sale(1000);

        /**
         * 动态代理
         * 特点：字节码随用随创建 随用随加载
         * 作用：不修改源码的基础上对方法增强
         * 分类：基于接口的动态代理 基于子类的动态代理
         *
         * 如何创建代理对象 使用proxy类中的newProxyInstance方法
         *
         * 创建代理对象的要求 被代理类最少实现一个接口 如果没有则无法使用
         *
         * newProxyInstance方法参数
         *  ClassLoader 类加载器
         *      他是用于加载代理对象字节码的 和被代理对象使用相同的类加载器 固定写法
         *  Class[]字节码数组
         *      它是用于代理对象中和被代理对象有相同方法 固定写法
         *  InvocationHandler 用于增强代码·
         *      它是让我们写如何代理 我们一般都是该接口的实现类 通常情况下都是匿名内部类 但不是必须
         */
        IProducer proxy = (IProducer) Proxy.newProxyInstance(producer.getClass().getClassLoader(),
                producer.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * 执行被代理对象的任何接口方法都会经过该方法
                     * invoke：调用的意思
                     * @param proxy 代理对象的引用
                     * @param method 当前执行的方法
                     * @param args 当前执行方法所需的参数
                     * @return 和被代理对象方法相同的返回值
                     * @throws Throwable
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        //提供增强的方法
                        Object returnVal = null;
                        //获取方法参数
                        Integer money = (Integer)args[0];
                        //判断当前方法是否是sale
                        if("sale".equals(method.getName())){
                            returnVal = method.invoke(producer,money*2);
                        }
                        return returnVal;
                    }
                });

        proxy.sale(2000);
    }
}
