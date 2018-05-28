package com.ny.thread;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.Writer;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        int a=0;
        int b=a++;
        System.out.println(b+","+a);
         a=0;
         b=a++;
        System.out.println(b+","+a);

    }
}
