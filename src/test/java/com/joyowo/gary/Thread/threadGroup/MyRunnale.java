package com.joyowo.gary.Thread.threadGroup;

/**
 * Created by jishu0425 on 2017/5/2.
 */
public class MyRunnale implements Runnable {

    @Override
    public void run() {
        for (int x = 0; x < 100; x++) {
            System.out.println(Thread.currentThread().getName() + ":" + x);
        }
    }
}
