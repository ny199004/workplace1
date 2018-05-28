package com.ny.thread;

/**
 * 1.避免单继承局限性
 * 2.方便共享资源
 */
public class StaticProxy {
    public static void main(String[] args) {
        Thread th=new Thread(new Programmer());
        th.start();
        for (int i = 0; i <100; i++) {
            System.out.println("一边写代码helloworld");
        }
    }
}

class Programmer implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100; i++) {
            System.out.println("一边听歌");
        }
    }
}