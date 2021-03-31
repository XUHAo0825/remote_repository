package com.guru.github.algorithm;

public class Question018 {

    //题目：两个乒乓球队进行比赛各出三人，甲队为abc三人 乙队为xyz三人 已抽签决定比赛名单 有人向队员打听比赛名单 a他说不和x比，c说他不和x和z比，请编程找到三场名单
    //程序分析：如何遍历处理，如何选择遍历对象是这道题的重点，感觉

    public static void main(String[] args) { //个人练习：是一道自己想不出，看有看的明白的题目

        for(char i='x';i<='z';i++) {
            for (char j='x';j<='z';j++) {
                if(i!=j) {
                    for(char k='x';k<='z';k++) {
                        if(i!=k&&j!=k) {
                            if(i!='x'&& k!='x'&& k!='z') {
                                System.out.println("a:"+i+"\nb:"+j+"\nc:"+k);
                            }
                        }
                    }
                }
            }
        }
    }
}
