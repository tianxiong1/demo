package com.tianxiong.demo.test;

public class D {
   public static void main(String[] args) {
   /*    Man m = new Man();
       People p =  (People)m;
       p.say();*/
       System.out.println("------------------------");
       People p2 = new People();
       System.out.println(p2.getClass());
       Man m2 = (Man)p2;
       m2.eat();
       m2.say();
   }
}

class People{
     void say(){
        System.out.println("people  say");
     }
}
class Man extends People{
   void eat(){
      System.out.println("eat-----");
   }

   @Override
   void say() {
      System.out.println("son  say");
   }
}
