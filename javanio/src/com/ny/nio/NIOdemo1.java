package com.ny.nio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOdemo1 {
    /**
     * test
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String infile = "D:\\02_spring_ioc.mp4";
        String outfile = "D:\\iocopy.mp4";
        String outfile2 = "D:\\niocopy.mp4";

        long start = System.currentTimeMillis();
        normalCopy(infile, outfile2);
        long end1 = System.currentTimeMillis();
        nioCopy(infile, outfile);
        long end2 = System.currentTimeMillis();


        System.out.println("io copy lasts: " + (end1 - start));
        System.out.println("nio copy lasts: " + (end2 - end1));
    }

    //nio文件复制功能
    public static void nioCopy(String infile, String outfile) throws Exception {
        FileInputStream fin = new FileInputStream(infile);
        FileOutputStream fout = new FileOutputStream(outfile);
        FileChannel fcin = fin.getChannel();
        FileChannel fcout = fout.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        while (true) {
            buffer.clear();
            int r = fcin.read(buffer);
            if (r == -1) {
                break;
            }
            buffer.flip();
            fcout.write(buffer);
        }

        fcin.close();
        fcout.close();
        fin.close();
        fout.close();
    }

    //普通I/O文件复制功能
    public static void normalCopy(String infile, String outfile) throws Exception{
        FileInputStream fin = new FileInputStream(infile);
        FileOutputStream fout = new FileOutputStream(outfile);
        BufferedInputStream bis=new BufferedInputStream(fin);
        BufferedOutputStream bos=new BufferedOutputStream(fout);
        byte[] block = new byte[1024];
        int len=0;
        while(-1!=(len=bis.read(block))) {
            bos.write(block,0,len);
        }
        bos.flush();
        bos.close();
        bis.close();
        //不需要再关闭
      //  fin.close();
       // fout.close();
    }
}
