package com.ecommerceApp.ecommerceApp.JavaBasicProgram.string;

import com.ecommerceApp.ecommerceApp.JavaBasicProgram.DS.BubbleSort;

import java.util.ArrayList;
import java.util.List;

public class StringSort {
    public static void main(String[] args) {
        String s = "soumo";
        char[] chars = s.toCharArray();
        List<Character> chList = new ArrayList<>();
        for (char c : chars)
            chList.add(c);
        List<Character> sortArr = new BubbleSort().sortChar(chList);
        StringBuilder sb = new StringBuilder();
        for (char i : sortArr) {
            sb.append(i);
        }
        System.out.println(sb);
    }
}
