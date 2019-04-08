package com.tianxiong.demo.demo;

public class Thread2 extends Thread {

    @Override
    public void run() {
        System.out.println("这是继承中的run()");
    }

    public static void main(String[] args) {
        new Thread2().run();//方法调用
        new Thread2().start();//线程启动
    }
}
