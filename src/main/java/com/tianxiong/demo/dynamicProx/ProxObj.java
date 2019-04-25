package com.tianxiong.demo.dynamicProx;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxObj implements InvocationHandler {
    static int a= 0;
    Object object;

    ProxObj(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        a++;
       // System.out.println("处理前");
        Object o = method.invoke(object,args);
       // System.out.println("处理后");
        System.out.println(a);
        return o;
    }
}
