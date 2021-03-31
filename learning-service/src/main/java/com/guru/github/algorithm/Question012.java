package com.guru.github.algorithm;

import java.util.Scanner;

public class Question012 {

    //题目：企业发放奖金根据利润提成，利润低于等于10万奖金提10%；利润高于10万元，利润低于20万，低于10万按10%，高出的可提成7.5；
    // 20-40万之间提成5%，40-60万之间提成3%，60-100提成1.5%，高出100提成1%，从键盘输入当月利润，求应当发放奖金？
    //程序分析：无脑的运算算法

    public static void main(String[] args) { //个人练习：较为简单的条件判断算法

        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = 0;

        if(x<=0){
            y=0;
        }else if(x<10){
            y=y*0.1;
        }else if(x<20){
            y=(10*0.1) + (x-10)*0.075;
        }else if(x<40){
            y=(10*0.1) + (10*0.075) + (x-20)*0.05;
        }else if(x<60){
            y=(10*0.1) + (10*0.075) + (20*0.05) + (x-20)*0.03;
        }else if(x<100){
            y=(10*0.1) + (10*0.075) + (20*0.05) + (20*0.03) + (x-100)*0.015;
        }else {
            y=(10*0.1) + (10*0.075) + (20*0.05) + (20*0.03) + (40*0.015) + (x-100)*0.01;
        }
        System.out.println(y);
    }
}
