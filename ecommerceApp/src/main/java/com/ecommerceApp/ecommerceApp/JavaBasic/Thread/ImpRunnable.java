package com.ecommerceApp.ecommerceApp.JavaBasic.Thread;

import lombok.SneakyThrows;

public class ImpRunnable {

    public static void main(String[] args) {
        DemoRunnable runnable1 = new DemoRunnable("Thread 2");
        DemoRunnable runnable2 = new DemoRunnable("Thread 1");
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        t1.start();
        t2.start();
    }
}

class DemoRunnable implements Runnable {

    private String threadName;
    DemoRunnable(String threadName){
        this.threadName = threadName;
    }

    @SneakyThrows
    @Override
    public void run() {
        System.out.println("Running : " + threadName);
        for(int i = 4; i > 0; i--){
            if (i == 3 && threadName.equalsIgnoreCase("Thread 2"))
                Thread.sleep(5000);
            System.out.println("Thread: " + threadName + ", " + i);
        }

        System.out.println(threadName + " is dead");
    }
}