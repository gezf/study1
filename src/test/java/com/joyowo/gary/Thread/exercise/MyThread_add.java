package com.joyowo.gary.Thread.exercise;

/**
 * Created by jishu0425 on 2017/5/2.
 */
public class MyThread_add extends Thread {
    private Num num;
    private int j;

    MyThread_add(String name, Num num, int j) {
        super(name);
        this.num = num;
        this.j = j;
    }

    @Override
    public void run() {
        for (int i = 0; i < j; i++) {
            synchronized (num) {
                System.out.println(getName() + "增加了1，num=" + ++num.num);
            }
        }
    }
}
