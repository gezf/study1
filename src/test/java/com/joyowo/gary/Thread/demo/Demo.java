package com.joyowo.gary.Thread.demo;

import org.junit.Test;

/**
 * Created by jishu0425 on 2017/4/27.
 */

public class Demo extends Thread {

    @Test
    public void test1() {
        MyThread m1 = new MyThread("m1", null);
        MyThread m2 = new MyThread("m2", m1);
        MyThread m3 = new MyThread("m3", m2);
        m1.start();
        m2.start();
        m3.start();
    }

    @Test
    public void test2() {
        MyThread2 mt = new MyThread2("gary");
        System.out.println("name:" + mt.getThreadGroup().getName());
    }

    @Test
    public void test3() {
        ThreadLocal<Integer> tl = new ThreadLocal<Integer>();
        tl.set(10);
    }


}

