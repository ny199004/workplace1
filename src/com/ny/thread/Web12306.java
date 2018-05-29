package com.ny.thread;


import java.io.FileInputStream;

public class Web12306 implements  Runnable {
    private  int total=100;
    @Override
    public void run() {
       while(true){
           if(total<0){
               break;
           }
           System.out.println(Thread.currentThread().getName()+"抢到了"+total--);
        }
    }

    public static void main(String[] args) {
         Web12306 real=new Web12306();
         Web12306 real1=new Web12306();
         String str= new String();
          System.out.println("github直接新增");
         Thread t1=new Thread(real,"t1");
        Thread t2=new Thread(real,"t2");
        Thread t3=new Thread(real,"t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
