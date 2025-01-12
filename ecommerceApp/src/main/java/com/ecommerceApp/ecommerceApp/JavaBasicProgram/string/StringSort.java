package com.ecommerceApp.ecommerceApp.JavaBasicProgram.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String s = "soumo";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        System.out.println(new String(chars));
    }
}
