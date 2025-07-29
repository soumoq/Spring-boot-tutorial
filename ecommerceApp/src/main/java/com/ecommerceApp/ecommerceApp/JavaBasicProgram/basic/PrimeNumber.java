package com.ecommerceApp.ecommerceApp.JavaBasicProgram.basic;

public class PrimeNumber {
    public static void main(String[] args) {
        int p = 90;
        boolean isPrime = true;
        for (int i = 2; i < p; i++) {
            if (p % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("prime");
        else
            System.out.println("non prime");
    }
}
