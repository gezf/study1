package com.joyowo.gary.Thread.threadLocal;

import org.junit.Test;

/**
 * Created by jishu0425 on 2017/5/2.
 */
public class Demo {

    @Test
    public void test1() {
        MyThread myThread1 = new MyThread(new Storage());
        MyThread myThread2 = new MyThread(new Storage());

        myThread1.setTh1(10);
//        myThread2.setTh1(20);

        System.out.println("myThread1.getTh1():" + myThread1.getTh1());
//        System.out.println("myThread2.getTh1():" + myThread2.getTh1());

        System.out.println("myThread1.getTh2():" + myThread1.getTh2());
    }
}
