package com.guru.github.algorithm;

public class Question013 {

    //题目：一个整数，它加上100个是一个完全平方数，再加一个168又是一个完全平方数，请问这个数是什么？
    //程序分析：理解什么是完全平方数，如何进行除法运算得出

    public static void main(String[] args) { //个人练习：会去使用Math封装方法，了解底层如何实现

        for (int i = 0; i < 10000; i++) {
            if(Math.sqrt(i+100)%1==0 && Math.sqrt(i+268)%1==0){
                System.out.println(i);
            }
        }
    }
}
