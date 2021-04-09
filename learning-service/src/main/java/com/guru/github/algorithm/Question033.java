package com.guru.github.algorithm;

public class Question033 {

    //题目：打印出杨辉三角形
    //程序分析：操作二元数组打印出效果内容

    public static void main(String[] args) { //个人练习：拆分进行处理，需要逻辑缜密，还行整体设计的构思，挺需要这种练习的，下次独立练习

        int[][] a = new int[10][10];
        for(int i=0; i<10; i++) {
            a[i][i] = 1;
            a[i][0] = 1;
        }
        for(int i=2; i<10; i++) {
            for(int j=1; j<i; j++) {
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
        }
        for(int i=0; i<10; i++) {
            for(int k=0; k<2*(10-i)-1; k++) {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++) {
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
