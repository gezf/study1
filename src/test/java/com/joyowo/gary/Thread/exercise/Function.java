package com.joyowo.gary.Thread.exercise;

/**
 * Created by jishu0425 on 2017/5/2.
 */
public class Function {
    private boolean flag=false;
    //子线程要实现的功能
    public synchronized void sub(){
        while(flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for(int i=0;i<10;i++){
            //for循环内定义子线程的功能,这里简单的假设为打印一句话,主线程同理
            System.out.println("sub"+i);
        }

        flag=true;
        this.notify();
    }
    //主线程要实现的功能
    public synchronized void main(){
        while(!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for(int i=0;i<20;i++){
            System.out.println("main"+i);
        }

        flag=false;
        this.notify();
    }
}
