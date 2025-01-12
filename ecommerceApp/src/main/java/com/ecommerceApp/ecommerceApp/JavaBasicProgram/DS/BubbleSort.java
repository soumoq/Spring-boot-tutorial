package com.ecommerceApp.ecommerceApp.JavaBasicProgram.DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>(Arrays.asList('s', 'o', 'u', 'm', 'o'));

        System.out.println(new BubbleSort().sortChar(list));
    }

    public List sortChar(List<Character> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (list.get(i) < list.get(j)) {
                    list.set(i, (char) (list.get(i) + list.get(j)));
                    list.set(j, (char) (list.get(i) - list.get(j)));
                    list.set(i, (char) (list.get(i) - list.get(j)));
                }
            }
        }
        return list;
    }
}
