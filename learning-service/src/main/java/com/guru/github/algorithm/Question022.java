package com.guru.github.algorithm;

public class Question022 {

    //题目：利用递归方法求5!
    //程序分析：理解什么是递归方法

    public static void main(String[] args) { //个人练习：第一次独自实现错误，递归方法还有待提高
        System.out.println(fac(5));
    }

    private static int fac(int i){

        return i == 1 ? i : i*fac(i-1);
    }
}
