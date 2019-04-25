package com.tianxiong.demo.dynamicProx;

import org.apache.tomcat.Jar;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.ext.dirs"));
        //Subject subject = new Apple();
        Subject subject = new Banana();
        ProxObj proxObj = new ProxObj(subject);
        ClassLoader classLoader2 = Jar.class.getClassLoader().getClass().getClassLoader();
        /*System.out.println(classLoader2);
        System.out.println(classLoader2.getParent());
        System.out.println(classLoader2.getParent().getParent());
        ClassLoader classLoader = subject.getClass().getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());*/
        Subject s = (Subject) Proxy.newProxyInstance(classLoader2,new  Class[]{Subject.class}, proxObj);
        //System.out.println(s+"---"+s.getClass());
        s.eat();
   /*     int a = 1;
        if(a>0){
           return;
       }
        System.out.println("a");*/
    }
}
