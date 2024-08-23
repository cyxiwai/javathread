package com.xiwai.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class locktest1
{
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        try{
        //这里不可以放lock的加索过程，如果加锁遇到了异常，锁就无法
        //最好不使用synchronized和lock接口，尽量使用java.util.concurrent包内封装好的机制
        //只有尝试获取锁，可中断/超时功能等锁特有的功能时才使用lock

        }finally {
            lock.unlock();
        }
    }
}
