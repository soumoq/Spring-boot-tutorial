package com.ecommerceApp.ecommerceApp.JavaBasicProgram.basic;

public class AddComplexNumber {
    public static void main(String[] args) {
        new ComplexNumber().add(new ComplexNumber(2, 3), new ComplexNumber(1, 2)).showC();
    }
}

class ComplexNumber {
    private int real;
    private int imag;

    public ComplexNumber(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public ComplexNumber() {
    }

    public ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        this.real = c1.real + c2.real;
        this.imag = c1.imag + c2.imag;
        return this;
    }

    public void showC() {
        System.out.println(this.real + "+ i" + this.imag);
    }

}
