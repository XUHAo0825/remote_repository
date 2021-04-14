package com.guru.github.algorithm;

import java.util.Scanner;

public class Question046 {

    //题目：两个字符串连接程序
    //程序分析：拼接两个字符串的逻辑？

    public static void main(String[] args) { //个人练习：没理解这道题和算法有什么关系，可能需要理解一下数据结构吧

        Scanner s = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str1 = s.nextLine();
        System.out.print("请再输入一个字符串：");
        String str2 = s.nextLine();
        String str = str1+str2;
        System.out.println("连接后的字符串是："+str);
    }
}
