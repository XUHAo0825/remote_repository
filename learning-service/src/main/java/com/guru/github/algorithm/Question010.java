package com.guru.github.algorithm;

public class Question010 {

    //题目：一球从100米高度自由落体，每次落地反复跳回原高度的一半，再落下，求它第十次落地是经过了多少米？第十次反弹的高度是多少？
    //程序分析：

    public static void main(String[] args) { //个人练习：这个算法答案有瑕疵，可以反复推敲一下

        double total = 100;
        double high = 100;

        for (int i = 0; i < 10; i++) {

            high = high / 2;//当轮上升高度

            if(i == 9){
                total = total + high;
            }else {
                total = total + high * 2;//原路程 + 当轮总路程
            }

            System.out.println("i"+i+","+high);
            System.out.println("i"+i+","+total);
        }
        System.out.println("last tan high : " + high);
        System.out.println("total high:" + total);
    }
}
