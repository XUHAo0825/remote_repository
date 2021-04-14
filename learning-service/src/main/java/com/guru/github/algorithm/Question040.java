package com.guru.github.algorithm;

import java.util.Scanner;

public class Question040 {

    //题目：字符串排序
    //程序分析：按自己的逻辑实现排序

    public static void main(String[] args) { //个人练习：排序及字符串比较逻辑，比较经典，是个可以经常联系的题目

        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[5];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.next();
        }

        for (int i = 0; i < strings.length; i++) {
            for (int j = i+1; j < strings.length; j++) {
                if(!compare(strings[i],strings[j])){
                    String t = strings[i];
                    strings[i] = strings[j];
                    strings[j] = t;
                }
            }
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }

    private static boolean compare(String a,String b){
        boolean flag = true;
        for (int i = 0; i < a.length() && i < b.length(); i++) {
            if(a.charAt(i)>b.charAt(i)){
                flag = false;
                break;
            }else if(a.charAt(i)<b.charAt(i)){
                break;
            }
            if(i == b.length()-1 && a.length()>b.length()){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
