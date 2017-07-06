package com.joyowo.gary.Thread.demo;

/**
 * Created by jishu0425 on 2017/5/2.
 */
class MyThread extends Thread{
    private String name;
    private Thread pre;

    public MyThread(String name, Thread pre) {
        this.name = name;
        this.pre = pre;
    }

    public void run() {
        if(pre!=null) {
            try {
                pre.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int i=10;
        while(i>0){
            System.out.println("线程"+name+":"+i--);
        }
    }
}
