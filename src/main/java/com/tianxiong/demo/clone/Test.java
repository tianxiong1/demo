package com.tianxiong.demo.clone;

import com.tianxiong.demo.dynamicProx.Subject;

public class Test {
    public static void main(String[] args) {
       Class[] a =    new  Class[]{Subject.class};
        System.out.println(a);
        a.clone();
        Object o = new Object();
        System.out.println(o);
        Object[] oo = new Object[1];
        oo[0] = o;
        Object[] bb = oo.clone();
        System.out.println(oo);
        System.out.println(bb);
        System.out.println(oo.getClass() == bb.getClass());
        A aaa = new A();
        System.out.println("前===="+aaa.b);

        try {
           A aaaaa =  (A)aaa.clone();
            System.out.println(aaaaa);
            System.out.println("前===="+aaaaa.b);
            aaaaa.b.b = 99;
            System.out.println("a----"+aaa.b.b);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        B[] bbbbbb = new B[]{};
        bbbbbb[1] = new B();
        bbbbbb.clone();
    }
}
