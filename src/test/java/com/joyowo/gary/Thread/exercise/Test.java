package com.joyowo.gary.Thread.exercise;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by jishu0425 on 2017/5/3.
 */
public class Test {

    public static void main(String[] args) {
        final BlockingQueue<String> bq = new ArrayBlockingQueue<String>(16);
        for (int i = 0; i < 4; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            parseLog(bq.take());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
        System.out.println("begin:" + (System.currentTimeMillis() / 1000));
            /*模拟处理16行日志，下面的代码产生了16个日志对象，当前代码需要运行16秒才能打印完这些日志。
            修改程序代码，开四个线程让这16个对象在4秒钟打完。
            */
        for (int i = 0; i < 16; i++) {  //这行代码不能改动
            final String log = "" + (i + 1);//这行代码不能改动
            {
//                Test.parseLog(log);
                try {
                bq.put(log);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        }
//        System.out.println("end:"+(System.currentTimeMillis()/1000));
    }

    //parseLog方法内部的代码不能改动
    public static void parseLog(String log) {
        System.out.println(log + ":" + (System.currentTimeMillis() / 1000));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
