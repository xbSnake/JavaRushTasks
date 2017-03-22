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

        while(inStram.available()>0){
            int data = inStram.read();

            System.out.print((char)data);
        }
        inStram.close();
        reader.close();
    }
}