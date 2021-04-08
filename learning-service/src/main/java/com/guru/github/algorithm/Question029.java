package com.guru.github.algorithm;

import java.util.Scanner;

public class Question029 {

    //题目：求一个3*3矩阵对角线元素之和
    //程序分析：理解题目的内容 二元数组的对角线解

    public static void main(String[] args) { //个人练习：整体数据结构和所需获取结果的思考，过程比较简单

        Scanner input=new Scanner(System.in);
        int[][] a=new int[3][3];
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                a[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
        int sum=0;
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(i==j) {
                    sum+=a[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
