package com.tianxiong.demo.demo;

public class Thread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("这是实现的THread1");
    }

    public static void main(String[] args) {
        //new Thread1().run();
        new Thread(new Thread1()).start();
    }
}
