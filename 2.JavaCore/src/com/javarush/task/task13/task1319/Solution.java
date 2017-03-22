package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
       BufferedWriter writer = new BufferedWriter(new FileWriter(path));


        String s="";
        String longString="";

        while (!s.equals("exit")){
             s=reader.readLine();
             longString =longString+s+"\r\n" ;
        }
        writer.write(longString);

        writer.close();
        reader.close();



    }
}
