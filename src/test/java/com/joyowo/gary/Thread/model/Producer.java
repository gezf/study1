package com.joyowo.gary.Thread.model;

/**
 * Created by jishu0425 on 2017/4/27.
 */
public class Producer extends Thread {

    private Storage storage;
    private int num;
    private String name;

    public Producer(String name, Storage storage, int num) {
        this.name = name;
        this.storage = storage;
        this.num = num;
    }

    @Override
    public void run() {
        storage.produce(num);
    }
}
