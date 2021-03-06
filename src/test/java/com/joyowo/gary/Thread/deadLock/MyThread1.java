package com.joyowo.gary.Thread.deadLock;

/**
 * Created by jishu0425 on 2017/4/28.
 */
public class MyThread1 extends Thread {

    private Object obj1;
    private Object obj2;

    public MyThread1(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        System.out.println("MyThread1将要获取obj1锁");
        synchronized (obj1) {
            System.out.println("MyThread1正在使用obj1锁...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MyThread1将要获取obj2锁");
            synchronized (obj2) {
                System.out.println("MyThread1正在使用obj2锁...");
                System.out.println("MyThread1释放obj2锁！");
            }
            System.out.println("MyThread1释放obj1锁！");
        }
    }
}
