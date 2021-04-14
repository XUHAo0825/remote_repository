package com.guru.github.algorithm;

import java.util.Scanner;

public class Question048 {

    //题目：数据是四位的整数 传递过程中是加密的，加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换
    //程序分析：处理各个位数数据再进行输出 较为简单

    public static void main(String[] args) { //个人练习：较简单

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int t = arr[0];
        arr[0] = arr[3];
        arr[3] = t;
        t = arr[1];
        arr[1] = arr[2];
        arr[2] = t;
        for(int c : arr){
            System.out.println(encryption(c));
        }
    }

    private static int encryption(int num){
        return (num+5)%10;
    }
}
