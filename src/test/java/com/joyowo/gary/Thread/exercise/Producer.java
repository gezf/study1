package com.joyowo.gary.Thread.exercise;

/**
 * Created by jishu0425 on 2017/5/3.
 */
public class Producer extends Thread {

    private Student student;

    public Producer(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            if (i % 2 == 0) {
                student.set("张三", 30);
            } else {
                student.set("李四", 40);
            }
            i++;
        }
    }
}
