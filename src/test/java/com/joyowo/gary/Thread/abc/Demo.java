package com.joyowo.gary.Thread.abc;

import org.junit.Test;

/**
 * Created by jishu0425 on 2017/5/3.
 */
public class Demo {

    @Test
    public void test1() throws InterruptedException {
        ABC a = new ABC(null);
        ABC b = new ABC(a);
        ABC c = new ABC(b);
        a.pre = c;
        new Thread(a,"A").start();
//        Thread.sleep(10);
        new Thread(b,"B").start();
//        Thread.sleep(10);
        new Thread(c,"C").start();
    }
}
