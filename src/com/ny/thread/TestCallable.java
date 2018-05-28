package com.ny.thread;

import java.util.concurrent.*;

public class TestCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ser=Executors.newFixedThreadPool(1);
        Class1 c1=new Class1();
        Future<Integer> result=ser.submit(c1);
        int num=result.get();
        System.out.println(result);
        ser.shutdown();
    }
}

/**
 * 优点可以获取值
 */
class Class1 implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        return 1000;
    }
}