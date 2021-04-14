package com.guru.github.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question037 {

    //题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位
    //程序分析：感觉可以使用递归实现这个功能

    public static void main(String[] args) { //个人练习：遍历标记的题目 第一次练习错误 了解表达逻辑 有待练习

//        Scanner in = new Scanner(System.in);
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(in.nextInt());
//        }
//
//        list = sort(list);
//
//        System.out.println(list.get(0));

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean[] arr= new boolean[n];
        //循环赋值true
        for(int i=0;i<arr.length;i++) {
            arr[i]=true;
        }
        int leftCount=n;//当前总数
        int index=0;//下标
        int countNum=0;// 1 2 3中的那个数

        while(leftCount>1) {
            //如果当前为true
            if(arr[index]) {
                countNum++;//报数
                if(countNum==3) {//第三个记录移除
                    arr[index]=false;
                    leftCount--;//总数减一
                    countNum=0;//重新计数
                }
            }
            index++;//循环下标
            if(index==n) {
                index=0;
            }
        }
        //输出唯一为true的小标位置
        for(int i=0;i<n;i++) {
            if(arr[i]) {
                System.out.println(i+1);
            }
        }
    }

    private static List<Integer> sort(List<Integer> list){

        if(list.size() <= 1){

            return list;

        }else if(list.size() == 2){

            List<Integer> newList = new ArrayList<>();
            newList.add(list.get(1));
            return newList;

        }else{

            List<Integer> newList = new ArrayList<>();
            for (int i = 1; i <= list.size(); i++) {
                if(i%3 != 0){
                    newList.add(list.get(i-1));
                }
            }
            return sort(newList);

        }
    }
}
