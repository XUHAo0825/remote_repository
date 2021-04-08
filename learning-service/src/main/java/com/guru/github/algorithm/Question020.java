package com.guru.github.algorithm;

public class Question020 {

    //题目：有一分数序列 2/1,3/2,5/3,8/5,13/8,21/13求出这个数列前20项之和
    //程序分析：找到数列规律，注意类型转换问题

    public static void main(String[] args) { //个人练习：刚开始没有找到数列规律耽误了不少时间，需要注意，类型转换问题也没有即时注意

        int a = 2;// 2 3 5 8 13 21
        int b = 1;// 1 2 3 5 8 13
        int t;
        double sum = a/b;

        double x;
        for(int i = 1; i < 20; i++){

            System.out.println("a:"+a+"b:"+b);

            t = a;

            x = (double)(a+b)/a;
            System.out.println("x:"+x);
            sum+=x;

            a = a+b;
            b = t;
        }
        System.out.println(sum);
    }
}
