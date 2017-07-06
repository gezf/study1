package com.joyowo.gary.Thread.demo;

/**
 * Created by jishu0425 on 2017/5/2.
 */
public class MyThread2 extends Thread {

    public MyThread2() {
    }

    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println(Thread.currentThread().getName() + i++);
        }
    }
}
