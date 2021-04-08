package com.guru.github.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Question030 {

    //题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中
    //程序分析：插入数据进数组的设计 需要对数组足够了解

    public static void main(String[] args) { //个人练习：数组知识需要提高

        Scanner input=new Scanner(System.in);
        int[] a=new int[10];
        for(int i=0;i<10;i++) {
            a[i]=input.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<10;i++) {
            System.out.println(a[i]);
        }
        int x=input.nextInt();
        a= sort(a, x);
        for (int value : a) {
            System.out.println(value);
        }
    }

    private static int[] sort(int[] a,int b) {
        int[] c=new int[a.length+1];
        boolean flag=true;
        for(int i=0;i<a.length;i++) {
            if(flag) {
                if(a[i]<b) {
                    c[i]=a[i];
                }else {
                    c[i]=b;
                    flag=false;
                    //这个方法比较冷门
                    System.arraycopy(a, i, c, i+1, a.length-i);
                }
            }else {
                break;
            }
        }
        return c;
    }
}
