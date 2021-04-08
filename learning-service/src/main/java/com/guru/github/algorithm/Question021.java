package com.guru.github.algorithm;

public class Question021 {

    //题目：求1+2!+3!+...+20!的和
    //程序分析：了解阶乘的算法

    public static void main(String[] args) { //个人练习：裂开来，以为阶乘是累加结果是累乘，需要了解概念

        int sum = 0, x =1;
        for (int i = 1; i < 21; i++) {
            x=x*i;
            sum+=x;
            System.out.println("i:____"+i+",x:____"+x);
        }
        System.out.println(sum);
    }
}
