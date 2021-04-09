package com.guru.github.algorithm;

import java.util.Scanner;

public class Question036 {

    //题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
    //程序分析：输入一个m, 将前面数往后移动m位，最后的m位变为最前面

    public static void main(String[] args) { //个人练习：可独立完成

        Scanner in = new Scanner(System.in);
        int len = 5;
        int m = 2;

        int[] arr = new int[len];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

        int[] newArr = new int[len];
        for(int i = 0; i<len; i++){
            if(i<m){
                System.out.println("len"+len+"m"+m+"i"+i);
                newArr[i] = arr[len-m+i];
            }else {
                System.out.println("len"+len+"m"+m+"i"+i);
                newArr[i] = arr[i-m];
            }
        }

        for(int i = 0; i<len; i++){
            System.out.println(newArr[i]);
        }
    }
}
