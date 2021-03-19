package com.guru.github.algorithm;

import java.util.Scanner;

public class Question008 {

    //题目：求s=a+aa+aaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制
    //程序分析：

    public static void main(String[] args) { //个人练习：不仔细考虑变量每轮的变化，很容易出错，是一道有小陷阱的题

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a >= 10) {
            System.out.println("请输入个位数哈");
            return;
        }

        int n = input.nextInt();
        if (n <= 1) {
            System.out.println("循环次数不能小于1");
            return;
        }
        int sum = 0, b = 0;
        for (int i = 1; i < n; i++) {
            b += a;
            System.out.println(b);
            sum += b;
            a= a * 10;
        }
        System.out.println("Total:" + sum);
    }
}
