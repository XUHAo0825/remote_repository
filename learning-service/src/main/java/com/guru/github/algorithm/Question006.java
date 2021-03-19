package com.guru.github.algorithm;

import java.util.Scanner;

public class Question006 {

    //题目：输入两个正整数m和n, 求其最大公约数和最小公倍数
    //程序分析：理解什么是公因数 什么是公倍数

    public static void main(String[] args) { //个人练习：值得理解和练习的题目，还不是很理解

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int x = get(a,b);
        if(x == 0) {
            System.out.println("不存在公因数");
            return;
        }
        System.out.println("最小公因数："+x);
        System.out.println("最大公倍数："+a*b/x);
    }

    private static int get(int a,int b){

        if(a<b){ //替换一下
            int t = b;
            b = a;
            a = t;
        }

        while (b != 0){
            if(a==b){
                return a;
            }
            int x = b;
            b = a % b;
            a = x;
        }
        return a;
    }
}
