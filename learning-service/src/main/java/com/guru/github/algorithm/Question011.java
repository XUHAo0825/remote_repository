package com.guru.github.algorithm;

public class Question011 {

    //题目：有1.2.3.4四个数字 能组成多少个互不相同且一个数字中无重复的三位数？并把它们输出出来
    //程序分析：三重for循环两两比较 输出结果

    public static void main(String[] args) { //个人练习：较为简单 第一时间没有反应过来 比较不能接受多重循环

        int count = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if(i != j && i != k && j != k){
                        count++;
                        System.out.println(i*100+j*10+k);
                    }
                }
            }
        }
        System.out.println(count);
    }
}
