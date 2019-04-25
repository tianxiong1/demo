package com.tianxiong.demo.test;

public class E {
    public static void main(String[] args) {
         E e = new E();
        //System.out.println("传参前--"+e);
        System.out.println( e == e.getE(e));  //true
       // System.out.println("传参后"+e);
       // System.out.println("--------------------");
        E e2 = new E();
//        System.out.println(e2);
        // e2.getE2(e2);
        System.out.println( e2 == e.getE(e2));//false
//        System.out.println("传参后"+e2);
//        System.out.println("--------------------");
        E e3 = new E();
//        System.out.println(e3);
        System.out.println( e3 == e.getE(e3)); //true
//        System.out.println("传参后"+e3);
//        System.out.println("--------------------");
        E e4 = new E();
//        System.out.println("传参前--"+e4);
        System.out.println(getE4(e4));
//        System.out.println("--------------------");
        E e5 = new E();
//        System.out.println("传参前--"+e5);
        System.out.println(getE5(e5) == e5);
//        System.out.println("--------------------");
        E e6 = new E();
//        System.out.println("传参前--"+e6);
        System.out.println(getE6(e6) == e6);
    }
    E getE(E e){
        E e1 = new E();
        System.out.println(e1);
        e = e1;
        System.out.println(e1);
        System.out.println(e);
        return e;
    }
    E getE2(E e){
        E e1 = new E();
        System.out.println(e1);
        e = e1;
        System.out.println(e1);
        System.out.println(e);
        return e1;
    }
    E getE3(E e){
      /*  E e1 = new E();
        System.out.println(e1.getClass());
        e = e1;*/
        System.out.println(e);
        return e;
    }
   static  E getE4(E e){
        E e1 = new E();
        System.out.println(e1);
        e = e1;
        return e;
    }
    static E getE5(E e){
        E e1 = new E();
        System.out.println(e1);
        e = e1;
        return e1;
    }
    static E getE6(E e){
      /*  E e1 = new E();
        System.out.println(e1.getClass());
        e = e1;*/
        System.out.println(e);
        return e;
    }
}
