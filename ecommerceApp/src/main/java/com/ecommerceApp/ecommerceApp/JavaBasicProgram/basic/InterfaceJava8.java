package com.ecommerceApp.ecommerceApp.JavaBasicProgram.basic;

public class InterfaceJava8 implements A,B {
    public static void main(String[] args) {
        InterfaceJava8 obj = new InterfaceJava8();
        obj.show();
    }

    @Override
    public void show() {
        A.super.show();
    }
}

interface A {
    default void show() {
        System.out.println("a");
    }
}

interface B {
    default void show() {
        System.out.println("b");
    }
}
