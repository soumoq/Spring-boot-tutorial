package com.ecommerceApp.ecommerceApp.JavaBasicProgram.thread;

//Thread example join and synchronized
public class ExmThread {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    count.increase();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    count.increase();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.getCount());

    }
}

class Count {
    private int count;

    public int getCount() {
        return count;
    }

    public synchronized void increase() {
        ++count;
    }
}

