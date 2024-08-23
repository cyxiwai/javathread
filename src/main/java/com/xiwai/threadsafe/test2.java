package com.xiwai.threadsafe;
//可见性问题
public class test2 {
    public static boolean stop =false;
    public static void main(String[] args) throws InterruptedException{
        Thread thread1 = new Thread(()->{
            while(!stop)
            {

            }
            System.out.println("Thread I stopped");
        });
        Thread thread2 = new Thread(() -> {
            stop = true;
            System.out.println("Thread 2 set stop to true");
        });
        thread1.start();
        Thread.sleep(100); // 确保thread1已经开始执行
        thread2.start();
    }
}
