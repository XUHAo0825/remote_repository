package com.guru.github.algorithm;

import java.util.Scanner;

public class Question004 {

    //题目：将正整数分解质因数 例如输入90，打印出90=2*3*3*5
    //程序分析：对n进行分解质因数，应先找到最小的质数，然后按下述步骤实现

    public static void main(String[] args) { //个人练习：什么是质因数，什么是质数，如何考虑由最小开始进行除法 中等

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = 2;
        while (n>=k){
            if(n==k){
                System.out.println(k);
                break;
            }else if(n%k==0){
                System.out.println(k);
                n=n/k;
            }else {
                k++;
            }
        }
    }
}
