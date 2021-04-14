package com.guru.github.algorithm;

import java.util.Scanner;

public class Question045 {

    //题目：判断一个整数能被几个9整除
    //程序分析：题目不清晰，最终按这个题目处理

    public static void main(String[] args) { //个人练习：循环整除处理

        Scanner s = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num = s.nextInt();
        int tmp = num;
        int count = 0;
        while(tmp%9 == 0){
            tmp = tmp/9;
            count++;
        }
        System.out.println(num+" 能够被 "+count+" 个9整除。");
    }
}
