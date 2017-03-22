package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       String path = reader.readLine();
       InputStream inStram = new FileInputStream(path);

       byte[] data = new byte[inStram.available()];

        int i=0;
        while(inStram.available()>0){

            data[i] =(byte)inStram.read();
            i++;

        }
        System.out.println(new String (data));

        inStram.close();
        reader.close();
    }
}