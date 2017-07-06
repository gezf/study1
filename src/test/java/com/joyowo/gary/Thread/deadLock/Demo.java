package com.joyowo.gary.Thread.deadLock;

/**
 * Created by jishu0425 on 2017/4/28.
 */
public class Demo {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        MyThread1 thread1 = new MyThread1(obj1, obj2);
        MyThread2 thread2 = new MyThread2(obj1, obj2);
        thread1.start();
        thread2.start();
    }
}
