package com.guru.github.algorithm;

public class Question003 {

    //题目：101-1000数字下, 打印所有水仙花数
    //程序分析：水仙花数是三位数下各个位数的三次方总和等于本身

    public static void main(String[] args) { //个人练习：什么是水仙花数，如何计算得到各个位数上的值，还行

        for(int i = 101; i<1000; i++){
            int a = i/100;//百位
            int b = i/10%10;//个位
            int c = i%10;//十位
            if (a*a*a+b*b*b+c*c*c == i) System.out.println(i);
        }
    }
}
