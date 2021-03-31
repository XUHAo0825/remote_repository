package com.guru.github.algorithm;

public class Question016 {

    //题目：输出99乘法口诀
    //程序分析：简单的双重循环遍历结果

    public static void main(String[] args) { //个人练习：较为简单的算法，重点是前期得考虑实际展示的效果

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j + "*" + i + "=" + i*j + " ");
            }
            System.out.println(" ");
        }
    }
}
