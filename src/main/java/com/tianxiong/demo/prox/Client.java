package com.tianxiong.demo.prox;

public class Client {
    public static void main(String[] args) {
        Server server = new ProxServer(new SubServer());
        server.say();
    }
}
