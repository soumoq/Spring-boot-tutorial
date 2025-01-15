package com.ecommerceApp.ecommerceApp.JavaBasicProgram.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapPareChar {
    public static void main(String[] args) {
        System.out.println(new SwapPareChar().soumoSwap("Soumo"));
        System.out.println(new SwapPareChar().swapUsingStringBuffer("GeeksForGeeks"));
    }

    //GeeksForGeeks
//eGkeFsroeGkes
    //Java
    //vaja
    public String swapPare(String s) {
        char[] charArr = s.toCharArray();
        char lastChar = 0;
        if (charArr.length % 2 != 0) {
            lastChar = charArr[charArr.length - 1];
            charArr = new char[charArr.length - 1];
        }
        System.out.println(charArr);
        for (int i = 0; i < charArr.length; i++) {
            char temp = charArr[i];
            charArr[i] = charArr[i + 1];
            System.out.println(temp);
            charArr[i + 1] = temp;
            ++i;
        }
        if (lastChar != 0) {
            charArr = new char[charArr.length + 1];
            charArr[charArr.length - 1] = lastChar;
        }
        return new String(charArr);
    }

    public String soumoSwap(String s) {
        if (s == null)
            return s;
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length - 1; i = i + 2) {
            System.out.println(i);
            char temp = charArr[i];
            charArr[i] = charArr[i + 1];
            charArr[i + 1] = temp;
        }
        return String.valueOf(charArr);
    }

    public String swapUsingStringBuffer(String s) {
        if (s == null || s.isEmpty())
            return s;
        StringBuffer sb = new StringBuffer();
        int length = s.length();

        for (int i = 0; i < length - 1; i += 2) {
            sb.append(s.charAt(i + 1));
            sb.append(s.charAt(i));
        }

        if (length % 2 != 0) {
            sb.append(s.charAt(length - 1));
        }
        return sb.toString();
    }

}
