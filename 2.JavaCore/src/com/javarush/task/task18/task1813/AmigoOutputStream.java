package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "1.txt";
    private  FileOutputStream fos;

    public AmigoOutputStream(FileOutputStream fr) throws FileNotFoundException {
        super(fileName);
        fos = fr;

    }


    @Override
    public void write(int b) throws IOException {
        fos.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fos.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fos.write(b, off, len);
    }

    public void  flush() throws IOException {
        fos.flush();

    }
    public void close() throws IOException {
        fos.flush();
        String s = "JavaRush © All rights reserved.";
        fos.write(s.getBytes());
        fos.close();

    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }


}
