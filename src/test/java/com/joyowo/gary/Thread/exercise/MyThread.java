package com.joyowo.gary.Thread.exercise;


/**
 * Created by jishu0425 on 2017/5/3.
 */
public class MyThread extends Thread{
    private MyThread pre;
    private int id;
    private int num;
    private static int count;

    public MyThread(int id, MyThread pre,int num){
        super("myThread"+id);
        this.id= id;
        this.pre = pre;
        this.num = num;
        count++;
    }

    @Override
    public void run() {
        int j=1+(id-1)*5;
        while (j<num){
            synchronized (pre){
                synchronized (this){
                    for (int i=j;i<j+5;i++){
                        System.out.println(getName()+":"+i);
                    }
                    j+=count*5;
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

    public void setPre(MyThread pre) {
        this.pre = pre;
    }
}
