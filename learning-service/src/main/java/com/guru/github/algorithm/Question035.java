package com.guru.github.algorithm;

import java.util.Scanner;

public class Question035 {

    //题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组
    //程序分析：实现一个下标内容替换的逻辑

    public static void main(String[] args) { //个人练习：可以独自完成的一道题目

        //找到最大最小的下标 与 第一个和最后一个元素进行替换
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

        int minIndex = 0;
        int min = arr[minIndex];
        int maxIndex = arr.length-1;
        int max = arr[maxIndex];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                minIndex = i;
                min = arr[i];
            }else if(arr[i] > max){
                maxIndex = i;
                max = arr[i];
            }
        }

        arr[minIndex] = arr[0];
        arr[0] = min;
        arr[maxIndex] = arr[arr.length-1];
        arr[arr.length-1] = max;

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}
