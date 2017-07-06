package com.joyowo.gary.Thread.model;

/**
 * Created by jishu0425 on 2017/4/27.
 */
public class Demo {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Producer p1 = new Producer("p1",storage,1);
        Producer p2 = new Producer("p2",storage,2);
        Producer p3 = new Producer("p3",storage,3);

        Consumer c1 = new Consumer("c1",storage,1);
        Consumer c2 = new Consumer("c2",storage,2);


        c1.start();
        c2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        p1.start();
        p2.start();
        p3.start();
    }
}
