package com.tianxiong.demo.thread;

public class thread extends Thread{
    int sum =0;

    @Override
    public void run() {
        sum += 1;
    }

    public static void main(String[] args) {
         for(int i=0;i<100;i++){
             thread a =  new thread();
             a.start();
             System.out.println(a.sum);
         }
    }
}
