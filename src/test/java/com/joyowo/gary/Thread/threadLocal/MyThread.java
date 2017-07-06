package com.joyowo.gary.Thread.threadLocal;

/**
 * Created by jishu0425 on 2017/5/2.
 */
public class MyThread {

    private Storage storage;

    public MyThread(Storage storage) {
        this.storage = storage;
    }

    public void setTh1(Integer i) {
        storage.th1.set(i);
    }

    public Integer getTh1() {
        return storage.th1.get();
    }

    public void setTh2(Integer i) {
        storage.th2.set(i);
    }

    public Integer getTh2() {
        return storage.th2.get();
    }

}
