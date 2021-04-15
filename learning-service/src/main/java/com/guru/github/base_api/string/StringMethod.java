package com.guru.github.base_api.string;

import java.util.Arrays;

public class StringMethod {

    //String demo_null = null;
    private static String demo = "Hi. this is a String Demo.Hi1";
    private static String demo_1= "A";
    private static String demo_2= "Hi. this is a String Demo.HiG";
    private static String demo_3= "a";
    private static String demo_5= "\uD835\uDD6B";
    private static String demo_4= "孟子翊";

    public static void main(String[] args) {

        //1.------长度 获取位置上的字符------五个方法
        //base1();

        //2.------字符串比较------四个方法
        //base2();

        //3.------数据类型转换-----三类方法
        //base3();

        //4.------字符串查找------两个方法
        //base4();

        //5.------截取和拆分------三个方法
        //base5();

        //6.------替换或修改------六个方法
        //base6();

        //7.------额外--------
        base5();

    }

    /**
     * 长度对比 获取指定位置字节
     */
    private static void base1(){

        //length() 输出字符串的长度(代码单元长度) int
        System.out.println(demo.length());
        //codePointCount(begin,end) 输出字符串的码值长度 int
        System.out.println(demo_5.codePointCount(0,demo_5.length()));

        //charAt(index) 输出指定(代码单元)下标的字符 char
        System.out.println(demo.charAt(1));
        //codePointAt(index) 输出指定下标的字符码点 char (unicode 码值范围是0~0x10FFFF 超出则是用两个char类型变量保存)
        System.out.println(demo_4.codePointAt(2));

        //getChars(begin,end,arr,index) 获取指定位置字符并放入数组中
        char[] arr = new char[10];
        demo.getChars(1,5,arr,4);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 比较字符串大小 Unicode大小 或者 内容
     */
    private static void base2(){

        // compareTo(x) 比较字符串之间的Unicode值 boolean
        System.out.println(demo.compareTo(demo_1));
        System.out.println(demo.compareTo(demo_2));

        // compareToIgnoreCase(x) 比较字符串之间的Unicode值无视大小写 boolean
        System.out.println(demo.compareToIgnoreCase(demo_1));
        System.out.println(demo_1.compareToIgnoreCase(demo_3));

        // equals(x) 对比String的内容是否相等 boolean
        System.out.println("Hi. this is a String Demo.".equals(demo));

        // contentEquals(x) 对比String和字节数组或StringBuilder类型的内容是否相等 boolean
        System.out.println(demo_3.contentEquals(new StringBuilder("a")));

        // equalsIgnoreCase(x) 比较string的内容不区分大小写是否相等 boolean
        System.out.println(demo.equalsIgnoreCase("Hi. this is a String Demo."));
    }

    /**
     * 类型间转换
     */
    private static void base3(){

        //parse() 包装类提供方法将 字符串->包装类
//        Byte.parseByte("a");
//        Integer.parseInt("1");
//        Long.parseLong("1");
//        Float.parseFloat("1");
//        Double.parseDouble("1");

        //valueOf(x) 字符串转换x基本类型为字符串 基本类型->字符串
//        String.valueOf(1);
//        String.valueOf(1L);
//        String.valueOf(1.0f);
//        String.valueOf(1.0d);
//        String.valueOf(true);

        //toString(x) 包装类也提供了将基本类型转换为字符串 基本类型->字符串
//        Integer.toString(1);
//        Long.toString(1L);
//        Float.toString(1.0f);
//        Double.toString(1.0d);
//        Boolean.toString(true);

    }

    /**
     * 查找字符串或字符的指定下标
     */
    private static void base4(){

        // indexOf(x,index) 查找字符x第index个的具体下标 int
        System.out.println(demo.indexOf('i',2));

        // lastIndexOf(x,index) 从末位查找字符x第index个的具体下标 int
        System.out.println(demo.lastIndexOf('i', 2));
    }

    /**
     * 截取和拆分
     */
    private static void base5(){

        // subString(index,index) 通过下标进行截取 前闭后开[x,y) String
        System.out.println(demo.substring(2,10));
        // subString(index,index) 通过下标进行截取 前闭后开[x,y) CharSequence 返回类型不同 当时进行了一次转换
        System.out.println(demo.subSequence(2,10));

        // split(x,limit) 通过字符串x进行分割字符串 分成若干个字符串数组, limit限制切割的数组长度 String[]
        System.out.println(Arrays.toString(demo.split("i",2)));
    }

    /**
     * 替换或修改
     */
    private static void base6(){

        //concat(x) 拼接字符串 又叫合并字符串
        System.out.println(demo_1.concat(demo_3));

        //toLowerCase() 将字符串全部转小写
        System.out.println(demo.toLowerCase());

        //toUpperCase() 将字符串全部转大写
        System.out.println(demo.toUpperCase());

        // replace(x,y) 将x替换为y 可以是字节可以是字符
        System.out.println(demo.replace('i', 'o'));
        System.out.println(demo.replace("i", "o"));
        System.out.println(demo.replace("is", "gg"));

        // replaceAll(regex,replacement) 需要结合正则表达式进行全部替换
        System.out.println(demo.replaceAll("(?i)Hi", "C++"));

        // replaceFirst(regex,replacement) 需要结合正则表达式进行第一个替换
        System.out.println(demo.replaceFirst("(?-i)Hi", "C++"));
    }

    /**
     * 包含 判空 获取地址 确认前缀后缀 删除前后空白符
     */
    private static void base7(){

        //contains(x) 字符串是否包含子串 boolean
        System.out.println(demo.contains("this"));

        // isEmpty()长度是否为空 boolean
        System.out.println(demo.isEmpty());

        // intern()首次创建的堆内存地址的对象 String
        System.out.println(demo.intern());

        // startsWith(x, index) 从第index开始前缀是否是x
        System.out.println(demo_4.startsWith("子", 1));
        // endsWith(x) 从后缀是否是x
        System.out.println(demo_4.endsWith("子"));

        // trim() 删除字符串的前后空白符
        System.out.println(demo.trim());
    }

}
