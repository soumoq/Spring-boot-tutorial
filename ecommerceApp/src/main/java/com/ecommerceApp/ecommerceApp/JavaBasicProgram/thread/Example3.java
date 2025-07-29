package com.ecommerceApp.ecommerceApp.JavaBasicProgram.thread;

public class Example3 {
    public static void main(String[] args) throws InterruptedException {
        Counts counts = new Counts();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10000;i++)
                    counts.increse();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10000;i++)
                    counts.increse();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counts.getValue());
    }
}

class Counts {
    private int value;

    public synchronized void increse(){
        value++;
    }

    public int getValue(){
        return value;
    }
}
