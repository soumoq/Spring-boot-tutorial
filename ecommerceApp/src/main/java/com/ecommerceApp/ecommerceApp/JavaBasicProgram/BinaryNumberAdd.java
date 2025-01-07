package com.ecommerceApp.ecommerceApp.JavaBasicProgram;

public class BinaryNumberAdd {
    public static void main(String[] args) {
        int a = Integer.parseInt("1001", 2);
        int b = Integer.parseInt("1011", 2);
        addBinary(a, b);
    }

    private static void addBinary(int a, int b){
        System.out.println(Integer.toBinaryString(a + b));
    }
}
