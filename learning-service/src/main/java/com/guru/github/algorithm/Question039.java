package com.guru.github.algorithm;

import java.util.Scanner;

public class Question039 {

    //题目：编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+...+1/n(利用指针函数)
    //程序分析：需要知道什么是指针函数 [指针函数就是返回的类型是某一类型的指针]

    public static void main(String[] args) { //个人练习：题目实现了 但是不知道这个是指针函数

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        double result = 0;
        if(a%2==0){
            for(int i = 2; i <= a; i+=2){
                result +=(double)1/i;
            }

        }else{

            for(int i = 1; i <= a; i+=2){
                result +=(double)1/i;
            }
        }
        System.out.println(result);
    }
}
