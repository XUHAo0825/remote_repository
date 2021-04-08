package com.guru.github.algorithm;

public class Question023 {

    //题目：有五个人坐在一起，第五个人比第四个人大两岁，依次大两岁，第一个人10岁，问第五个多少岁
    //程序分析：迭代方法

    public static void main(String[] args) { //个人练习：较简单，直接实现成功

        int age = 10;
        for (int i = 1; i < 5; i++) {
            age += 2;
        }
        System.out.println(age);
    }
}
