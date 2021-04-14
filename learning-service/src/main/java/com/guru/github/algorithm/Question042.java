package com.guru.github.algorithm;

public class Question042 {

    //题目：809*??=800*??+9*??+1    其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。求??代表的两位数，及809*??后的结果
    //程序分析：题目有问题 无解 需要把1去掉，那样809*??=800*??+9*??就没有意义 挺奇怪的题目

    public static void main(String[] args) { //个人练习：主要是感觉后面两个条件得出结果

        for (int i = 10; i < 100; i++) {
            if(8*i<100 && 9*i>=100){
                System.out.println(i);
                System.out.println(i*809);
                break;
            }
        }
    }
}
