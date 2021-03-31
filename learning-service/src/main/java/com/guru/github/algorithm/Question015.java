package com.guru.github.algorithm;

import java.util.Scanner;

public class Question015 {

    //题目：输入三个整数x,y,z，请把这三个数由小到大输出
    //程序分析：有点类似排序的功能

    public static void main(String[] args) { //个人练习：进行三轮排序进行最终位置确认，是到值得思考的题目

        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int z=input.nextInt();

        int t;
        if(x>y) {
            t=x;
            x=y;
            y=t;
        }
        if(y>z) {
            t=z;
            z=y;
            y=t;
        }
        if(x>y) {
            t=x;
            x=y;
            y=t;
        }
        System.out.println(x+""+y+""+z);
    }
}
