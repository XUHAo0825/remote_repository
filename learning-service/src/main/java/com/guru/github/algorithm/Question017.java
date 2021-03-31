package com.guru.github.algorithm;

public class Question017 {

    //题目：猴子吃桃，第一天摘了若干个，当即吃了一半，又多吃了一个，每天如此，第十天发现还有1个，求第一天摘了多少个？
    //程序分析：考虑可以被整除，奇数偶数问题需要考虑进来，算法相对简单

    public static void main(String[] args) { //个人练习：相对简单，需要思考，自己做错啦

        int count = 1;
        for (int i = 1; i < 10; i++) {
            count = (count + 1) * 2 ;
            System.out.println(count);
        }

    }
}
