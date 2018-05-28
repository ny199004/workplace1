package com.ny.thread;

public class Thread1 extends  Thread {
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            try {
               // Thread.sleep(1000);
                System.out.println("Thread1跑了"+i+"歩");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
 class Thread2 extends  Thread {
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            try {
                // Thread.sleep(1000);
                System.out.println("Thread2跑了"+i+"歩");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

