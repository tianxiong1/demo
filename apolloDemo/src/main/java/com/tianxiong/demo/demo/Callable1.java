package com.tianxiong.demo.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Callable1 implements Callable {
    @Override
    public String call() throws Exception {
        return "call方法";
    }

    public static void main(String[] args) throws Exception {
        //System.out.println(new Callable1().call());
        FutureTask futureTask =  new FutureTask<>(new Callable1());
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
     }
}
