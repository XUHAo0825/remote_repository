package com.guru.github.spring.proxy;

public class Producer implements IProducer{

    public void sale(Integer price){
        System.out.println("销售产品，并获取金额：" + price);
    }

    public void saleAfter(Integer price){
        System.out.println("销售产品，售后服务：" + price);
    }
}
