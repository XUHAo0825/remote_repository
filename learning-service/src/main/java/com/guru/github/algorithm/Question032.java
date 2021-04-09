package com.guru.github.algorithm;

import java.util.Scanner;

public class Question032 {

    //题目：取一个整数a从右端开始的4~7位
    //程序分析：输入一个内容，输出第4到第6个

    public static void main(String[] args) { //个人练习：字符串封装方法熟悉

        Scanner in = new Scanner(System.in);
        String content = in.next();

        if(content.length() < 7){
            System.out.println("end");
            return;
        }

        System.out.println(content.substring(3,7));

//        String toString=in.nextLine();
//        char[] a=toString.toCharArray();
//        int j=a.length;
//        if(j<7) {
//            System.out.println("error!");
//        }
//        System.out.println(a[j-7]+""+a[j-6]+""+a[j-5]+""+a[j-4]);
    }
}
