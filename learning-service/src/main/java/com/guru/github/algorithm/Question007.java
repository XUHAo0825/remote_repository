package com.guru.github.algorithm;

import java.util.Scanner;

public class Question007 {

    //题目：输入一行字符，分别统计其中英文字母、空格、数字和其他字符的个数
    //程序分析：理解ASCII码的位置 方法

    public static void main(String[] args) { //个人练习：不是一道难的题，是一个考验基础的题目

        int abc=0;
        int space=0;
        int num=0;
        int others=0;

        Scanner input = new Scanner(System.in);
        String toString = input.nextLine();
        char[] ch = toString.toCharArray();

        for(char c : ch){
            if (Character.isLetter(c)) {
                abc++;
            } else if (Character.isDigit(c)) {
                num++;
            } else if (Character.isSpaceChar(c)) {
                space++;
            } else {
                others++;
            }
        }
        System.out.println("abc:"+abc);
        System.out.println("space:"+space);
        System.out.println("num:"+num);
        System.out.println("others:"+others);
    }
}
