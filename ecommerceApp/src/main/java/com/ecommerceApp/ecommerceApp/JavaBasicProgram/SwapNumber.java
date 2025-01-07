package com.ecommerceApp.ecommerceApp.JavaBasicProgram;

public class SwapNumber {
    public static void main(String[] args) {
        swap(2, 4);
        swap(2, 4, true);
    }

    private static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }

    private static void swap(int a, int b, boolean check) {
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);
    }
}
