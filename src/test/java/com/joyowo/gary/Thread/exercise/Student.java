package com.joyowo.gary.Thread.exercise;

/**
 * Created by jishu0425 on 2017/5/3.
 */
public class Student {

    public boolean flag = false;
    public String name = null;
    public Integer age = null;

    public synchronized void set(String name, Integer age) {
        if (this.flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        this.age = age;
        this.flag = true;
        this.notify();
    }

    public synchronized void get() {
        if (!this.flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("name:" + this.name + ",age:" + this.age);
        this.flag = false;
        this.notify();
    }

}
