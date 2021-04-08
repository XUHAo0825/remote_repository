package com.guru.github.algorithm;

import java.util.Scanner;

public class Question026 {

    //题目：请输入星期几的第一个字母来判断是星期几，如果第一个字母一样，则继续判断下一个
    //程序分析：

    public static void main(String[] args) { //个人练习：简单的条件判断算法

        char c = getChar();
        //sunday monday tuesday wednesday thursday friday saturday
        switch (c){
            case 'm': case 'M':
                System.out.println("Monday");
                break;
            case 'f': case 'F':
                System.out.println("Friday");
                break;
            case 'w': case 'W':
                System.out.println("Wednesday");
                break;
            case 's': case 'S':
                char c2 = getChar();
                switch (c2){
                    case 'u': case 'U':
                        System.out.println("Sunday");
                        break;
                    case 'a': case 'A':
                        System.out.println("Saturday");
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case 't': case 'T':
                char c3 = getChar();
                switch (c3){
                    case 'u': case 'U':
                        System.out.println("Tuesday");
                        break;
                    case 'h': case 'H':
                        System.out.println("Thursday");
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }
    }

    private static char getChar(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().charAt(0);
    }
}
