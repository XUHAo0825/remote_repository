package com.guru.github.algorithm;

import java.util.Scanner;

public class Question014 {

    //题目：输入某年某月某日，判断这一天是这一年的第几天？
    //程序分析：日期天数的概念 闰月的概念

    public static void main(String[] args) { //个人练习：要足够了解日期天数运算，进行天数累加计算

        //do while语句的含义
        Scanner in = new Scanner(System.in);
        System.out.print("输入年：");
        int year = in.nextInt();
        System.out.print("输入月：");
        int month = in.nextInt();
        System.out.print("输入日：");
        int day = in.nextInt();

        int d = 0;
        for (int i = 0; i < month; i++) {
            int days = 0;
            switch (i){
                case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                    days = 31;
                    break;
                case 4:case 6:case 9:case 11:
                    days = 30;
                    break;
                case 2:
                    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
            }
            d += days;
        }

        System.out.println(d+day);

    }
}
