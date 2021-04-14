package com.guru.github.algorithm;

public class Question047 {

    //题目：读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊
    //程序分析：随机写入7位数，遍历打印出个位数的值？

    public static void main(String[] args) { //个人练习：理解个数是什么意思.....我感觉自己的理解能力越来越有问题

        Integer[] arr = new Integer[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(50-1)+1);
        }
        for (Integer a : arr) {
            System.out.println(a);
        }
        for (Integer a : arr) {
            System.out.println(a%10);
        }

//        Scanner s = new Scanner(System.in);
//        int n=1,num;
//        while(n<=7){
//            do{
//                System.out.print("请输入一个1--50之间的整数：");
//                num=s.nextInt();
//            }while(num<1||num>50);
//            for(int i=1;i<=num;i++)
//            {System.out.print("*");
//            }
//            System.out.println();
//            n ++;
//        }
    }
}
