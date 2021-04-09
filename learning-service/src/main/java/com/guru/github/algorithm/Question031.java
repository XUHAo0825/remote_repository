package com.guru.github.algorithm;

import java.util.Scanner;

public class Question031 {

    //题目：将一个数组逆序输出
    //程序分析：倒序输出数组的逻辑

    public static void main(String[] args) { //个人练习：简单的倒序输出处理

        int[] arr = new int[]{1,2,3,4,5,6};

        for (int i = arr.length -1; i > 0; i--) {
            System.out.println(arr[i]);
        }

//        Scanner input=new Scanner(System.in);
//        int[] a=new int[5];
//        int i=0;
//        do {
//            a[i]=input.nextInt();
//            i++;
//        }while(a[i-1]!=-1);
//        for(int j=0;j<i-1;j++) {
//            System.out.println(a[j]);
//        }
//        for(int k=i-1;k>0;k--) {
//            System.out.println(a[k-1]);
//        }
    }
}
