package com.joyowo.gary.Thread.threadGroup;

/**
 * Created by jishu0425 on 2017/5/2.
 */
public class ThreadGroupDemo {

    public static void main(String[] args) {
        // method1();
        method2();
    }

    /**
     * 通过线程组设置一组后台线程
     * 将多个线程统一设置为后台线程
     *
     */
    private static void method2() {
        ThreadGroup tg = new ThreadGroup("我是自定义的新线程组");
        MyRunnale my = new MyRunnale();
        Thread t1 = new Thread(tg,my,"线程1");
        Thread t2 = new Thread(tg,my,"线程2");
        System.out.println(t1.getThreadGroup().getName());
        System.out.println(t2.getThreadGroup().getName());
        // 通过线程组设置后台线程,表示该组的线程都是后台线程
        tg.setDaemon(true);

    }

    private static void method1() {
        MyRunnale my = new MyRunnale();
        Thread t1 = new Thread(my,"李威");
        Thread t2 = new Thread(my,"周光");
        // 我不知道他们属于哪个线程组
        // 我想知道怎么办
        // 调用线程类里面的方法
        ThreadGroup tg1 = t1.getThreadGroup();
        ThreadGroup tg2 = t2.getThreadGroup();
        // 线程组提供了方法,获得线程组的名字
        String name1 = tg1.getName();
        String name2 = tg2.getName();
        System.out.println(name1);
        System.out.println(name2);
        // 通过结果我们知道了：线程默认情况下属于 main 线程组
        // 通过下面的测试，你应该能够看到，默任情况下，所有的线程都属于同一个组
        System.out.println(Thread.currentThread().getThreadGroup().getName());

    }
}
