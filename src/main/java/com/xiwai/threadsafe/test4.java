package com.xiwai.threadsafe;

public class test4 implements Runnable{

    @Override
    public void run() {
        synchronized (this)
        {
            System.out.println("测试观察指令");
        }
    }
    public static synchronized void target()j
    {

    }

}
