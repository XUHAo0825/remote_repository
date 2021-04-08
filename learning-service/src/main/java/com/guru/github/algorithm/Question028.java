package com.guru.github.algorithm;

import java.util.Scanner;

public class Question028 {

    //题目：对10个数进行排序
    //程序分析：开放性排序题 进行有序排列

    public static void main(String[] args) { //个人练习：需要重温排序算法

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = sort(arr);
        for (int value : result) {
            System.out.println(value);
        }
    }

    private static int[] sort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        return arr;
    }
}
