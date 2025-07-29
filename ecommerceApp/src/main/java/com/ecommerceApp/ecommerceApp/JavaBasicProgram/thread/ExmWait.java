package com.ecommerceApp.ecommerceApp.JavaBasicProgram.thread;

public class ExmWait {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumers(q);
    }
}

class Q {
    int value;
    boolean isSet = false;

    public synchronized int getValue() throws InterruptedException {
        while (isSet) {
            wait();
        }
        System.out.println("Get : " + value);
        isSet = false;
        notify();
        return value;
    }

    public synchronized void setValue(int value) throws InterruptedException {
        while (!isSet) {
            wait();
        }
        this.value = value;
        System.out.println("Set : " + value);
        notify();
        isSet = true;
    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        Thread t1 = new Thread(this, "Producer");
        t1.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                q.setValue(i++);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumers implements Runnable {
    Q q;

    Consumers(Q q) {
        this.q = q;
        Thread t1 = new Thread(this, "Consumers");
        t1.start();

    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                q.getValue();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
