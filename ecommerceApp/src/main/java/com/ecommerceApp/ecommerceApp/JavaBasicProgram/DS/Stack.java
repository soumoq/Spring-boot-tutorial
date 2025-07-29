package com.ecommerceApp.ecommerceApp.JavaBasicProgram.DS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Stack {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        Stack stack = new Stack(4);
        System.out.println(stack.isEmpty());
        stack.push('2');
        stack.push('3');
        stack.push('5');
        stack.push('4');
        stack.push('6');
        System.out.println(stack.pick());
        System.out.println(stack.isFull());
        System.out.println(stack.pop());
        System.out.println(stack.pick());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pick());

    }

    private int top;
    private char[] stackArray;
    private int maxSize;

    public Stack(int size) {
        maxSize = size;
        top = -1;
        stackArray = new char[maxSize];
    }

    public void push(char element) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stackArray[top] = element;
    }

    public char pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
        }
        return stackArray[top--];
    }

    public char pick() {
        if (top == -1) {
            System.out.println("Stack empty");
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
