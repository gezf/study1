package com.joyowo.gary.Thread.abc;

/**
 * Created by jishu0425 on 2017/5/3.
 */
public class ABC implements Runnable {
    public ABC pre;

    public ABC(ABC myThread){
        this.pre = myThread;
    }

    @Override
    public void run() {
        while(true){
            synchronized (pre){
                synchronized (this){
                    System.out.println(Thread.currentThread().getName());
                    this.notifyAll();
                }
                try {
                    pre.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
