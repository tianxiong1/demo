package com.tianxiong.demo.controller;

public class Test1 {

    public static int[] a(int[] intoArray,int target){
        int firstIndex = 0;
        int secIndex = -1;
        for(int i=0,s1 = intoArray.length;i<s1;i++){
            for(int j=i+1,s2 = intoArray.length;j<s2;j++){
               if(target-intoArray[i] == intoArray[j] && i!=j){
                   firstIndex = i;
                   secIndex = j;
                   break;
               }
           }
        }
        int[] a = new int[2];
        a[0] = firstIndex;
        a[1] = secIndex;
        if(a[1]==-1){
            return null;
        }
        return  a;
    }

    public static void main(String[] args) {
        int a [] = {2, 7, 11, 15};
        int target = 19;
        int retunrA[] = a(a,target);
    }
}
