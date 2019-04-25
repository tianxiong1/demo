package com.tianxiong.demo.prox;

public class ProxServer implements Server {
    Server Server;
    ProxServer(Server Server){
         this.Server = Server;
    }
    @Override
    public void say() {
        Server.say();
    }
}
