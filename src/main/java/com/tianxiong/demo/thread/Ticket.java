package com.tianxiong.demo.thread;

public class Ticket extends Thread {
    private static  int ticket = 100000;//共一百张

    Ticket(){

    }
    Ticket(String name){
           super(name);
    }

    @Override
    public void run() {
        buy();
    }

    void  buy(){
        synchronized (this) {
            if (ticket <= 0) {
                System.out.println(this.getName() +"没买到");
                return;
            }
            ticket--;
           /* try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.out.println(this.getName() + "还剩" + (this.ticket) + "张");
        }
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        int time = 1;
        for(int i = 0;i<time;i++){
            Ticket t  = new Ticket(i+1+"");
            System.out.println(t.getName()+"開始买票了");
            t.start();

        }
        System.out.println("0-----------------------------------------------------"+(System.currentTimeMillis()-a));
    }
}
