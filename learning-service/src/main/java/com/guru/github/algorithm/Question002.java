package com.guru.github.algorithm;

public class Question002 {

    //题目：判断101-200之间有多少个素数，并输出所有素数
    //程序分析：判断素数的方法，用一个数分别除于2到sqrt，如果能被整除，则表明次数不是素数，反之是素数

    public static void main(String[] args) { //个人练习：了解什么是素数，稍微点拨，可以写出

        int count = 0;
        for(int i = 101; i<200; i++){
            boolean isTrue = true;
            for(int j = 2; j<i; j++){
                 if(i%j == 0){
                     isTrue = false;
                     break;
                 }
            }
            if(isTrue){
                count += 1;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
