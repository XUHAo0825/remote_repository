package com.guru.github.algorithm;

import java.util.Scanner;

public class Question024 {

    //题目：给一个不多于5位的正整数 要求 1求它几位数 2逆序打印出各位数字
    //程序分析：输入一个不多于5位的数 求出长度 和 倒序单独输出

    public static void main(String[] args) { //个人练习：感觉还是对数据的操作逻辑 和一些数据的基本操作方法的了解

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] num = s.toCharArray();
        System.out.println("长度:" + num.length);
        for(int i = num.length-1; i >= 0; i--){
            System.out.println(num[i]);
        }
    }
}
