package com.guru.github.algorithm;

import java.util.Scanner;

public class Question025 {

    //题目：一个5位数，判断它是不是回文数，即12321是回文数，个数和万位一致，十位和千位一致
    //程序分析：理解回文数和比较逻辑

    public static void main(String[] args) { //个人练习：我发现算法题不是为了算出结果，而是为了实现一个可支持这种情况的逻辑，不要限制边界

        Scanner scanner = new Scanner(System.in);
//        String content = scanner.next();
//        char[] chars = content.toCharArray();
//        if(chars.length != 5){
//            return;
//        }
//        if(chars[0] == chars[4] && chars[1] == chars[3]){
//            System.out.println(content+"是回文数");
//        }else {
//            System.out.println(content+"不是回文数");
//        }
        int numTest= scanner.nextInt();
        System.out.println(ver(numTest));
    }

    private static boolean ver(int num) {

        //如果非正整数 或者可以被10整除 为 非回文数
        if(num<0||(num!=0&&num%10==0)) return false;

        //ver倒序获取各个位置上的数，直至中间位，对比(前一半)和(后一半)是否一致
        int ver=0;
        while(num>ver) {
            ver=ver*10+num%10; //对比 ver*10 加上 个位数 余数
            num=num/10; //输入值减少一位
            System.out.println(ver+":"+num);
        }
        return(num==ver||num==ver/10);
    }
}
