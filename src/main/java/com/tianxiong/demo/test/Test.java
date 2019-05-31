package com.tianxiong.demo.test;

import java.util.*;

public class Test {
     List<B> bList ;

    public List<B> getbList() {
        return bList;
    }

    public void setbList(List<B> bList) {
        this.bList = bList;
    }

    public static void main(String[] args) {
       /* B b1 = new B();
        b1.setO("o1");
        B b2 = new B();
        b2.setO("o2");
        List<B> bList = new ArrayList<>();
        bList.add(b1);
        bList.add(b2);
        Test t = new Test();
        t.setbList(bList);
        System.out.println(t.getbList());
        for(B b:t.getbList()){
            System.out.println(b.getO());
        }
        System.out.println("---------");
        for(B b:t.getbList()){
            b.setO("333333");
        }
        for(B b:t.getbList()){
            System.out.println(b.getO());
        }*/
       List<String> list = new ArrayList<>();
/*       list.add("1");
       list.add("2");
        System.out.println(list);
        list.add("2");
        System.out.println(list);*/
       /* Set set = new HashSet();
        set.add("1");
        set.add("2");
        System.out.println(set);
        set.add("2");
        set.add("3");
        System.out.println(set);
        list.addAll(set);
        System.out.println(list);*/
/*       String a = "1.1";
       int i = Integer.parseInt(a);*/
/*        String a = "-0-1.12345";
        BigDecimal bb = new BigDecimal(a);
        System.out.println(bb);
        System.out.println(bb.scale());*/
        /*try{
            String a = "234343df1.2";
            BigDecimal amountBigDecimal = new BigDecimal(a);
            if(amountBigDecimal.scale()!=2){
                throw new RuntimeException();
            }
            System.out.println(a);
        }catch (Exception e){
            System.out.println("进来了");
        }*/
/*        int i =1;
        if(i>0){
            System.out.println("进来了e");
        }else{
            System.out.println("进来了");
        }
        int k = 0;

        for(int j=0;j<3;j++){
            if(j==2){
                System.out.println(j);
                k =3;
            }else{
                System.out.println(j+"------------");
            }
        }

        System.out.println(k);*/

       // setPlanKeyTime(null,true);
        Map<String,Object> map =new HashMap();
        map.put("1",new Object());
        map.put("2",new Object());
        map.put("2",new Object());
        map.put("4",new Object());
        Set<String> set =  map.keySet();
        for(String s : set){
            System.out.println(s);
        }
    }


    public static void setPlanKeyTime(List<String> keys, Boolean longTimeFlag)  {
        for (String key : keys) {
            if (key!=null && "".equals(key)) {
                System.out.println("哈哈");
                /*if (longTimeFlag) {
                    redisTemplate.expire(key, 3, TimeUnit.MINUTES);
                } else {
                    redisTemplate.delete(key);
                }*/
            }
        }
    }
}

class B{
    private String o ;


    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }
}