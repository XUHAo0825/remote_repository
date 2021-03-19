package com.guru.github.algorithm;

import java.util.Scanner;

public class Question005 {

    //题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示

    public static void main(String[] args) { //个人练习：仅使用条件运算符解决题目 简单

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        if(n >= 90){
//            System.out.println("A");
//        }else if(n >= 60){
//            System.out.println("B");
//        }else {
//            System.out.println("C");
//        }
        char grade = n >= 90 ? 'A' : n >= 60 ? 'B' : 'C';
        System.out.println(grade);
    }
}
