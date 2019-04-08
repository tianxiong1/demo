package com.tianxiong.demo;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class B {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String pathname="a.html";//该地址为macos下的地址,若要测试,请修改为对应的地址
        File file=new File(pathname);
        String urlstr="http://dzdzwxcs1.ciitc.com.cn/s/XvfVpBua";//此处为指定指定图片的url,以百度logo为例
        boolean success=naiveDownloadPicture(file, urlstr);
        System.out.println(success?"success":"false");
    }
    //最简url图片下载
    public static boolean naiveDownloadPicture(File file,String urlstr) {
        URL url = null;

        try {
            //生成图片链接的url类
            url = new URL(urlstr);
            //将url链接下的图片以字节流的形式存储到 DataInputStream类中
            DataInputStream dataInputStream = new DataInputStream(url.openStream());
            //为file生成对应的文件输出流
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            //定义字节数组大小
            byte[] buffer = new byte[1024];


            //从所包含的输入流中读取[buffer.length()]的字节，并将它们存储到缓冲区数组buffer 中。
            //dataInputStream.read()会返回写入到buffer的实际长度,若已经读完 则返回-1                  
            while (dataInputStream.read(buffer) > 0) {
                fileOutputStream.write(buffer);//将buffer中的字节写入文件中区
            }
            dataInputStream.close();//关闭输入流
            fileOutputStream.close();//关闭输出流

            return true;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}