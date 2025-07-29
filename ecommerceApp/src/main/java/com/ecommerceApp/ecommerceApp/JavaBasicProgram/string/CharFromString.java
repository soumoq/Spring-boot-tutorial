package com.ecommerceApp.ecommerceApp.JavaBasicProgram.string;

public class CharFromString {
    public static void main(String[] args) {
        String s1 = "Geeks";
        int c = 0;
        for (int i = s1.length() - 1; i >= 0; i--) {
            System.out.print(s1.charAt(i));
            if (s1.charAt(i) == 'e'){
                c++;
            }
        }
        System.out.println("\n" + c);
        System.out.println(s1.replace('e','p'));
        System.out.println(s1);

        String s = "Geeks";
        String r = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {

            // extracts each character
            ch = s.charAt(i);

            // adds each character in
            // front of the existing string
            System.out.println(r);
            r = ch + r;
        }

        System.out.println(r);
    }
}
