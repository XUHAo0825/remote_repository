package com.guru.github.algorithm;

import java.util.Scanner;

public class Question049 {

    //题目：计算字符串中子串出现的次数
    //程序分析：输入一个父字符串和一个子串 父串中出现多少次子串

    public static void main(String[] args) { //个人练习：采用string.split的方法来分割 判断

        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        String[] arr = a.split(b);
        if(arr.length <= 1){
            System.out.println("null");
        }else {
            System.out.println("包含"+(arr.length-1)+"个子串");
        }
    }
}
