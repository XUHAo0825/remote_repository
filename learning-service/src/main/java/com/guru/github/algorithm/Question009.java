package com.guru.github.algorithm;

public class Question009 {

    //题目：一个数如果恰好等于它因子之和，暂且称之为完数 例6=1+2+3，找出1000以内所有的完数
    //程序分析：理解什么是因子，如何得出因子之和 （拓展 因数是具体计算方程式的表述 a * b = c, a和b就称为因数）

    public static void main(String[] args) { //个人练习：因子又为约数，这个题目有问题，一个数的本身就是它的因子，如何做到因子之和等于本身
        for (int i = 1; i <= 1000; i++) {

            int t = 0;

            for (int j = 1; j <= i/2; j++) {
                if (i%j == 0) {
                    t+=j;
                }
            }

            if(t == i){
                System.out.println(i);
            }
        }
    }
}
