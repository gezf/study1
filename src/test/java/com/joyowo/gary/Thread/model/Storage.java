package com.joyowo.gary.Thread.model;

import java.util.LinkedList;

/**
 * Created by jishu0425 on 2017/4/27.
 */
//仓库类
public class Storage {
    private final static int MAX_SIZE = 100;
    private LinkedList<Object> list;

    public Storage() {
        list = new LinkedList<Object>();
    }

    //生产方法
    public void produce(int num){
        synchronized (list){
            while(list.size()+num>MAX_SIZE){
                System.out.println(Thread.currentThread().getName()+"生产了"+num+"个，仓库无法存放！");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for(int i=0;i<num;i++){
                list.push(new Object());
            }
            System.out.println(Thread.currentThread().getName()+"生产了"+num+"个，存放成功！-----------");
            list.notifyAll();
        }
    }

    //消费方法
    public void consume(int num){
        synchronized (list){
            while(list.size()-num<0){
                System.out.println(Thread.currentThread().getName()+"需要消费"+num+"个，仓库库存不足！");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for(int i=0;i<num;i++){
                list.pop();
            }
            System.out.println(Thread.currentThread().getName()+"消费了"+num+"个！-----------");
            list.notifyAll();
        }
    }

}
