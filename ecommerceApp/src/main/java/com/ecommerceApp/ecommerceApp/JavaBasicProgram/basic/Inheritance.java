package com.ecommerceApp.ecommerceApp.JavaBasicProgram.basic;

public class Inheritance {
    public static void main(String[] args) {
        //new C1();
        //new Cld(new Pr(), 222);
        P c = new C();
        c.parent();
    }
}

class P {
    public void parent() {
        System.out.println("Parent");
    }
}

class C extends P {
    public void parent() {
        System.out.println("Child");
    }

    public void showP(P p) {
        p.parent();
    }

    void test() {
        showP(this);
        super.parent();
    }
}

class Pr {
    Pr(Pr a, int b) {
        a.show(this);
    }

    Pr() {
    }

    private void show(Pr a) {
        System.out.println(a);
    }
}

class Cld extends Pr {
    Cld(Pr pr, int a) {
        super(pr, a);
    }
}

class A1 {
    public A1() {
        System.out.println("A1");
    }

    public A1(int a, int b, int c) {
        System.out.println("A1: " + a + " " + b + " " + c);
    }
}

class B1 extends A1 {
    public B1() {
        System.out.println("B1");
    }

    public B1(int a, int b, int c) {
        System.out.println("B1: " + b + " " + c);
    }
}

class C1 extends B1 {
    public C1() {
        super(1, 2, 3);
        System.out.println("C1");
    }

    public C1(int a, int b, int c) {
        super(a, b, c);
        System.out.println("C1: " + c);
    }
}
