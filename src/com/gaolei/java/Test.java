package com.gaolei.java;

/**
 * @author 高磊
 * @version 1.0
 * @date 2019/12/9 9:36
 */
public class Test {
    static boolean foo(char c) {
        System.out.println(c);
        return true;
    }

    public static void main(String[] args) {
        String s = "hello";
        String t = "hello";
        char[] c = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(s.equals(t));
        System.out.println(t.equals(c));
        System.out.println(s == t);
        System.out.println(t.equals(new String("hello")));
    }
}
