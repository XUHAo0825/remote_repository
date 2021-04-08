package com.guru.github.algorithm;

public class Question019 {

    //题目：打印菱形◇
    //程序分析：整理四个数列进行输出

    public static void main(String[] args) { //个人练习：如何一步确认数列结果是预期结果，是一种能力，我暂时还需要反复调试，有待提升

        for (int i = 1; i <= 7; i++) {

            if(i < 5){

                for (int j = 0; j < 4-i; j++) System.out.print(" ");

                for (int j = 0; j < 2*(i-1)+1; j++) System.out.print("*");

            }else {

                for (int j = 0; j < i-4; j++) System.out.print(" ");

                for (int j = 0; j < 5-(i-5)*2; j++) System.out.print("*");
            }

            System.out.println();
        }
    }
}
