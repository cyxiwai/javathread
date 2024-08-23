package com.xiwai.threadsafe;

public class test3 {
    public static void main(String[] args) {
        System.out.println("main start...");
        Thread t = new Thread() {
            public void run() {
                System.out.println("thread run...");
                System.out.println("thread end.");
            }
        };
        t.start();
        try {
            t.sleep(20);
        } catch (InterruptedException e) {
        }
        ;
        System.out.println("main end...");
    }
}

class myThread extends Thread {
    @Override
    public void run() {
        System.out.println("新线程，启动！");
    }
}
class myThread1 implements Runnable{
    @Override
    public void run()
    {

    }
}