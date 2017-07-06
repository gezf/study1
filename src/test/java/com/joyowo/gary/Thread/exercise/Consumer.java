package com.joyowo.gary.Thread.exercise;

/**
 * Created by jishu0425 on 2017/5/3.
 */
public class Consumer extends Thread {
    private Student student;

    public Consumer(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        while (true) {
            student.get();
        }
    }
}
