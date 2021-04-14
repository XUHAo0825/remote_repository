package com.guru.github.algorithm;

import java.util.Scanner;

public class Question044 {

    //题目：一个偶数总能是两个素数之和
    //程序分析：输入一个偶数，求出所有由两个素数之和得出的组合

    public static void main(String[] args) { //个人练习：有点看不懂题目，看以后是否能看懂

        Scanner s = new Scanner(System.in);
        int n,i;
        do{
            System.out.print("请输入一个大于等于6的偶数：");
            n = s.nextInt();
        } while(n<6||n%2!=0);   //判断输入是否是>=6偶数,不是,重新输入
        for(i=2;i<=n/2;i++){
            if((fun(i))==1&&(fun(n-i)==1)){
                int j=n-i;
                System.out.println(n+" = "+i+" +"+j);
            } //输出所有可能的素数对
        }
    }

    //判断是否是素数的函数
    private static int fun (int a){
        int i,flag=0;
        if(a==3){
            flag=1;
            return flag;
        }
        for(i=2;i<=Math.sqrt(a);i++){//Math.sqrt的作用？？
            if(a%i==0){
                flag=0;
                break;
            }
            else {
                flag=1;
            }
        }
        return flag;//不是素数,返回0,是素数,返回1
    }
}
