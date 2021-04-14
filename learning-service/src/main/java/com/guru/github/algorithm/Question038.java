package com.guru.github.algorithm;

import java.util.Scanner;

public class Question038 {

    //题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度
    //程序分析：不知道考点是什么 使用基础封装方法实现

    public static void main(String[] args) { //个人练习：简单

        Scanner in = new Scanner(System.in);
        String a = in.next();
        System.out.println(a.length());

        char[] arr = a.toCharArray();
        int count = 0;
        for(char c : arr){
            count++;
        }
        System.out.println(count);
    }
}
