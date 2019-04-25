package com.tianxiong.demo.test;

import java.security.MessageDigest;
public class MD5 {
    public static void main(String[] args) {
        MD5.md5EncodeWithSalt("5","1");
    }
    public static String md5EncodeWithSalt(String src,String salt){
        String hexString = md5Hex(src+salt);
        char[] cs = new char[48];
        for (int i=0;i<48;i=i+3){
            cs[i] = hexString.charAt(i/3*2);
            char c = salt.length() < i/3 ? 'a' : salt.charAt(i/3);
            cs[i+1] = c;
            cs[i+2] = hexString.charAt(i/3*2+1);
        }
        return new String(cs);
    }
    private static String md5Hex(String src){
        try{
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            byte[] bs = messageDigest.digest(src.getBytes());
            //return new String(/*Hex.encode(bs)*/);
            return "";
        }catch (Exception e){
            return null;
        }
    }
}
