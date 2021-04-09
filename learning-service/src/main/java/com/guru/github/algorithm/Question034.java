package com.guru.github.algorithm;

import java.util.Scanner;

public class Question034 {

    //题目：输入3个数a,b,c，按大小顺序输出
    //程序分析：数据比较并排序

    public static void main(String[] args) { //个人练习：经典的替换逻辑 排序常用到

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a>b){
            int t = a;
            a = b;
            b = t;
        }
        if(b>c){
            int t = b;
            b = c;
            c = t;
        }
        if(a>b){
            int t = a;
            a = b;
            b = t;
        }
        System.out.println(a+":"+b+":"+c);
    }
}
