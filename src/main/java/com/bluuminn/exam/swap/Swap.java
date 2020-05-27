package com.bluuminn.exam.swap;

public class Swap {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;

        System.out.println("초기값");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a ^= b;
        System.out.println("a = " + a + ", " + "b = " + b);
        b ^= a;
        System.out.println("a = " + a + ", " + "b = " + b);
        a ^= b;
        System.out.println("a = " + a + ", " + "b = " + b);

        System.out.println("연산 결과");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
