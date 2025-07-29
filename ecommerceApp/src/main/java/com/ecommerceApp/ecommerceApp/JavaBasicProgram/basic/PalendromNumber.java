package com.ecommerceApp.ecommerceApp.JavaBasicProgram.basic;

public class PalendromNumber {
    public static void main(String[] args) {
        String a = "aba";
        int i  = 123;
        int sum = 0;
        int backup = i;
        int rev = 0;

        while (i > 0){
            sum = (sum * 10) + (i % 10) + rev;
            i = i / 10;
        }
        System.out.println(sum);
    }
}
