package com.ecommerceApp.ecommerceApp.JavaBasic.Thread;

import lombok.SneakyThrows;

public class ImpThread {
    public static void main(String[] args) throws InterruptedException {
        DemoThread t1 = new DemoThread("Thread 1");
        DemoThread t2 = new DemoThread("Thread 2");
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.join();
        t2.start();
    }

}

class DemoThread extends Thread {

    private String threadName;
    DemoThread(String threadName){
        this.threadName = threadName;
    }

    @SneakyThrows
    @Override
    public void run() {
        System.out.println("Running : " + threadName);
        for(int i = 4; i > 0; i--){
            if (i == 3 && threadName.equalsIgnoreCase("Thread 2"))
                Thread.sleep(5000);
            Thread.yield();

            System.out.println("Thread: " + threadName + ", " + i);
        }

        System.out.println(threadName + " is dead");

    }

    @Override
    public void start() {
        System.out.println("Started : " + threadName);
        super.start();
    }
}