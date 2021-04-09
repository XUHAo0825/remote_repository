package com.guru.github.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question037 {

    //题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位
    //程序分析：感觉可以使用递归实现这个功能

    public static void main(String[] args) { //个人练习：

//        Scanner in = new Scanner(System.in);
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(in.nextInt());
//        }
//
//        list = sort(list);
//
//        System.out.println(list.get(0));

        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        boolean[] arr=new boolean[n];
        for(int i=0;i<arr.length;i++) {
            arr[i]=true;
        }
        int leftCount=n;
        int index=0;
        int countNum=0;
        while(leftCount>1) {
            if(arr[index]) {
                countNum++;
                if(countNum==3) {
                    arr[index]=false;
                    leftCount--;
                    countNum=0;
                }
            }
            index++;
            if(index==n) {
                index=0;
            }
        }
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
