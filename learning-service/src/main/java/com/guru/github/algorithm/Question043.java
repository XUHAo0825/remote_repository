package com.guru.github.algorithm;

public class Question043 {

    //题目：求0—7所能组成的奇数个数
    //程序分析：每个位数上有几种可能 由这些组成，没有说可不可以重复，我觉得有点误导性

    public static void main(String[] args) { //个人练习：不重复的奇数算法 排序的效率觉得这个的执行效率，标答是错的

        //奇数不能被2整除 1 3 5 7
        int count = 0;
        for(int j = 1; j <= 76543210; j++){
            String a = String.valueOf(j);
            if(a.contains("8") || a.contains("9") || duplicate(a)){
                continue;
            }
            if(j%2 != 0){
                count++;
            }
            System.out.println(j);
        }
        System.out.println(count);
    }

    private static boolean duplicate(String a){
        char[] arr = a.toCharArray();
        if(a.length()>2){
            for (int i = 0; i < a.length()-1; i++) {
                for (int j = i+1; j < a.length(); j++) {
                    if(arr[i]==arr[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
