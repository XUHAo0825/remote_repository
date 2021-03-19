package com.guru.github.algorithm;

public class Question001 {

    //古典题目：有一对兔子，从出生后第三个月起每个月生一对兔子，小兔子长到第三个月后每一个月又生一对兔子，假如兔子都不死，每个月的兔子总数是多少

    //菲波拉契数列
    public static void main(String[] args) { //个人练习：雨里雾里，什么是斐波拉契数列 困难

        int f1 = 1,f2 = 1,f;
        int M = 30;

        System.out.println(f1);
        System.out.println(f2);
        for (int i = 0; i < M; i++) {
            f = f2;
            f2 = f1 + f2;
            f1 = f;
            System.out.println(f2);
        }
    }
}
