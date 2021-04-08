package com.guru.github.algorithm;

public class Question027 {

    //题目：求一百以内的素数
    //程序分析：素数除了1和本身不能被整除的数

    public static void main(String[] args) { //个人练习：如何最优得出素数的最小除法项，通过i的根去减少范围

        System.out.println(Math.sqrt(30));
        for(int i = 2; i < 100; i++){

            boolean is = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i%j == 0){
                    is = false;
                    break;
                }
            }
            if(is){
                System.out.println("素数："+i);
            }
        }
    }
}
