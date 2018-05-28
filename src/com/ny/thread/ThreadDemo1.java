package com.ny.thread;

public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println("main run");

        Thread1 thread1=new Thread1();
        Thread2 th2=new Thread2();
        thread1.start();
        th2.start();
        for(int i=0;i<100;i++){
           // Thread.sleep(1000);
            System.out.println("main --"+i);
        }
    }
}
