package com.tianxiong.demo.test;

import java.math.BigDecimal;

public class TestBigDecamel {
    public static void main(String[] args) {
       long start =   0;

        start =   System.currentTimeMillis();
        System.out.println("开始时-----"+start);
        for(int i=0;i<10000000;i++){
            BigDecimal bigDecimal = new BigDecimal(i);
        }
        // BigDecimal bigDecima2 = new BigDecimal(1);
        System.out.println("结束-----"+(System.currentTimeMillis()-start));

        start =   System.currentTimeMillis();
        System.out.println("开始时-----"+start);
        for(int i=0;i<10000000;i++){
            BigDecimal bigDecimal = new BigDecimal("10");
        }
        //BigDecimal bigDecimal = new BigDecimal("10");
        System.out.println("结束-----"+(System.currentTimeMillis()-start));

       BigDecimal a = new BigDecimal("123451.23456789");
        System.out.println(a.scale());
        System.out.println(a.intValue());
        System.out.println(a.precision());

    }
}
