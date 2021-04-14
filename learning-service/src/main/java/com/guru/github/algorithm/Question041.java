package com.guru.github.algorithm;

public class Question041 {

    //题目：海滩上有一堆桃子，五只猴子来分，第一只猴子把这堆桃子平均分为五分，多出了一个，这个猴子把多出的一个扔进海中，拿走了一份，第二只猴子把剩下的桃子
    //分成了五分，有多出一个同样扔到海中，拿走一份，接下来第三第四第五都是这样，问海滩最少多少个桃子
    //程序分析：倒序推论

    public static void main(String[] args) { //个人练习：个人练习完完全全的做错啦，需要反复审题，确认逻辑，在动手实现；这个解题思路也是暴力直白，值得学习

//        int monkey = 5;
//        int count = 1;
//        for (int i = 0; i < 5; i++) {
//            count = count*monkey + 1;
//        }
//        System.out.println(count);//3906

        int i,m,j=0,k,count;
        for(i=4;i<10000;i+=4) {
            count=0;
            m=i;
            for(k=0;k<5;k++){
                j=i/4*5+1;
                i=j;
                if(j%4==0)
                    count++;
                else break;
            }
            i=m;
            if(count==4)
            {System.out.println("原有桃子 "+j+" 个");
                break;}
        }
    }
}
