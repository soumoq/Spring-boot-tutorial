package com.ecommerceApp.ecommerceApp.JavaBasicProgram.string;

import com.ecommerceApp.ecommerceApp.JavaBasicProgram.DS.Stack;

public class StringRevUsingStack {
    public static void main(String[] args) {
        String str = "Soumo";
        StringBuffer sb = new StringBuffer();
        Stack stack = new Stack(str.length());
        for (char chr : str.toCharArray()){
            stack.push(chr);
        }
        for (char chr : str.toCharArray()){
            sb.append(stack.pop());
        }
        System.out.println(sb);

    }
}
