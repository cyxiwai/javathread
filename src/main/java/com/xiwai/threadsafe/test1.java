package com.xiwai.threadsafe;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test1 {
    public static void main(String[] args) throws InterruptedException {
        final int Threads = 500;
        ThreadUnsafeExample threadUnsafeExample = new ThreadUnsafeExample();
        final CountDownLatch countDownLatch = new CountDownLatch(Threads);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < Threads; i++) {
            executorService.execute(() -> {
                threadUnsafeExample.add();
                countDownLatch.countDown();
            });
        }

        countDownLatch.await();
        executorService.shutdown();
        System.out.println(threadUnsafeExample.get());

    }
}

class ThreadUnsafeExample {
    private int count;

    public void add() {
        count++;
    }

    public int get() {
        return count;
    }

}