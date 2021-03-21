package com.guru.github.spring.cglib;

import com.guru.github.spring.proxy.Producer;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Client {

    public static void main(String[] args) {

        final Producer producer = new Producer();
        producer.sale(1000);

        /**
         * 动态代理
         * 特点：字节码随用随创建 随用随加载
         * 作用：不修改源码的基础上对方法增强
         * 分类：基于接口的动态代理 基于子类的动态代理
         *
         * 基于子类动态代理
         * 涉及类Enhancer
         * 提供者第三方cglib库
         *
         * 如何创建代理对象 使用Enhancer类中的create方法
         *
         * 创建代理对象的要求 被代理类不能是最终类
         *
         * newProxyInstance方法参数
         *  Class 字节码
         *      它是用于被代理对象的字节码
         *  Callback 用于增强的代码
         *      它是用于代理对象中和被代理对象有相同方法 固定写法
         *  InvocationHandler 用于增强代码·
         *      它是让我们写如何代理 我们一般都是该接口的实现类 通常情况下都是匿名内部类 但不是必须
         */
        Producer proxy = (Producer) Enhancer.create(producer.getClass(), new MethodInterceptor() {

            /**
             * 执行被代理对象的任何方法都会经过该方法
             * intercept : 截距 切面的意思
             * @param proxy
             * @param method
             * @param objects
             * 以上三个参数与基于接口动态代理中的invoke参数一致
             * @param methodProxy 当前执行方法的代理对象
             * @return
             * @throws Throwable
             */
            public Object intercept(Object proxy, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                //提供增强的方法
                Object returnVal = null;
                //获取方法参数
                Integer money = (Integer)objects[0];
                //判断当前方法是否是sale
                if("sale".equals(method.getName())){
                    returnVal = method.invoke(producer,money*3);
                }
                return returnVal;
            }
        });

        proxy.sale(2000);
    }
}
