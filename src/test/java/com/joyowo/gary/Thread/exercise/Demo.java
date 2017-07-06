package com.joyowo.gary.Thread.exercise;

import org.junit.Test;

/**
 * Created by jishu0425 on 2017/5/2.
 */
public class Demo {
    @Test
    public void test1() {
        final Function f = new Function();
        new Thread(
                new Runnable() {

                    @Override
                    public void run() {
                        for (int i = 0; i < 5; i++) {
                            f.sub();
                        }
                    }

                }
        ).start();
        new Thread(
                new Runnable() {

                    @Override
                    public void run() {
                        for (int i = 0; i < 5; i++) {
                            f.main();
                        }
                    }

                }
        ).start();

    }


    @Test
    public void test2() {
        Num num = new Num(0);
        MyThread_add myThread_add1 = new MyThread_add("myThread_add1", num, 30);
        MyThread_add myThread_add2 = new MyThread_add("myThread_add2", num, 70);

        MyThread_sub myThread_sub1 = new MyThread_sub("myThread_sub1", num, 50);
        MyThread_sub myThread_sub2 = new MyThread_sub("myThread_sub2", num, 40);

        myThread_add1.start();
        myThread_add2.start();
        myThread_sub1.start();
        myThread_sub2.start();

        try {
            myThread_add1.join();
            myThread_add2.join();
            myThread_sub1.join();
            myThread_sub2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("最后的num：" + num.num);
    }

    @Test
    public void test3() {
        Student student = new Student();
        Producer p = new Producer(student);
        Consumer c = new Consumer(student);
        p.start();
        c.start();
//        try {
//            Thread.sleep(1000 * 5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.exit(0);
    }

    @Test
    public void test4() throws InterruptedException {
        MyThread myThread1 = new MyThread(1,null,75);
        MyThread myThread2 = new MyThread(2,myThread1,75);
        MyThread myThread3 = new MyThread(3,myThread2,75);
        MyThread myThread4 = new MyThread(4,myThread3,75);
        myThread1.setPre(myThread4);
        myThread1.start();
        Thread.sleep(10);
        myThread2.start();
        Thread.sleep(10);
        myThread3.start();
        Thread.sleep(10);
        myThread4.start();
    }
}
